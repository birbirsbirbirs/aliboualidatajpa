package co.pitam.aliboualidatajpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;
//    this is owner of the relationship
    @ManyToMany
    @JoinTable(
            name = "authors_courses",
            joinColumns = {
                    @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "authour_id")
            }
    )
    private List<Author> authors;
    @OneToMany(mappedBy = "course") // one course to many sections
    private List<Section> sections;
}
