package co.pitam.aliboualidatajpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
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
@PrimaryKeyJoinColumn(name = "video_id")
//@DiscriminatorValue("PV")
public class PitamVideo extends Resources {
    private int length;
}
