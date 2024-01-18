package co.pitam.aliboualidatajpa.repository;

import co.pitam.aliboualidatajpa.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    /*
    select * from author where first_name='ali'
     */
    List<Author> findAllByFirstName(String fn);

    List<Author> findAllByFirstNameIgnoreCase(String fn);

    List<Author> findAllByFirstNameContainingIgnoreCase(String fn);

    /*
    select * from author where first_name='ali%'
  */
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String fn);

    /*
    select * from author where first_name='%ali'
  */
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String fn);

    /*
    select * from author where first_name in ('ali','bou','coding')
  */
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);
}
