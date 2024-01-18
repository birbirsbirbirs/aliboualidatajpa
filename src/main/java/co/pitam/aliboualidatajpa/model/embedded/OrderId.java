package co.pitam.aliboualidatajpa.model.embedded;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class OrderId implements Serializable {
    private String username;
    private LocalDateTime orderDate;
}
