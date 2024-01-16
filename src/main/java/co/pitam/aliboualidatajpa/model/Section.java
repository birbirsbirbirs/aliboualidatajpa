package co.pitam.aliboualidatajpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
