package co.pitam.aliboualidatajpa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
@Entity
@DiscriminatorValue("PV")
public class PitamVideo extends Resources {
    private int length;
}
