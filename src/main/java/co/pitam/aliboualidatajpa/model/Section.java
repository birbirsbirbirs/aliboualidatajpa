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
public class Section {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int sectionOrder;
    @ManyToOne //many section belong to one course
    @JoinColumn(name = "course_id")
    private Course course;
    @OneToMany(mappedBy = "section")
    private List<Lecture> lectures;
}
