package co.pitam.aliboualidatajpa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
@Entity
@DiscriminatorValue("PF")
public class PitamFile extends Resources {
    private String type;
}
