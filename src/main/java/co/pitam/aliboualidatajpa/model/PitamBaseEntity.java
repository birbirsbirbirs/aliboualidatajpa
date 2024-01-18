package co.pitam.aliboualidatajpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@SuperBuilder
@AllArgsConstructor
@MappedSuperclass
public class PitamBaseEntity {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(
            updatable = false,
            nullable = false
    )
    private LocalDateTime createdAt;
    @Column(
            insertable = false
    )
    private LocalDateTime lastModifiedAt;
    private String createdBy;
    private String lastModifiedBy;
}
