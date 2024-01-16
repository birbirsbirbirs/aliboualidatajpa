package co.pitam.aliboualidatajpa.repository;

import co.pitam.aliboualidatajpa.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
