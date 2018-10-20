package examples.boot.myshop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER) // Board엔티티의 필드명.
    private List<Board> boards;

    public List<Board> getBoards(){
        System.out.println("getBoards!!!!!!!!");
        return boards;
    }
}
