package co.pitam.aliboualidatajpa.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
@Entity
//@PrimaryKeyJoinColumn(name = "video_id")
//@DiscriminatorValue("PV")
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class PitamVideo extends Resources {
    private int length;
}
