package co.pitam.aliboualidatajpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance(strategy = InheritanceType.JOINED) // but seperate tables with seperate attribute and connected by joined column
//@DiscriminatorColumn(name = "resource_type")
public class Resources {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int size;
    private String url;
    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
