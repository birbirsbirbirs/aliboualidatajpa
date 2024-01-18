package co.pitam.aliboualidatajpa.repository;

import co.pitam.aliboualidatajpa.model.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

//    update author a set a.age=22 where a.id=2
    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id=:id")
    int updateAuthor(int age,int id);


    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age")
    void updateAllAuthorAges(int age);

    List<Author> findByNamedQuery(@Param("age") int age);

    @Modifying
    @Transactional
    void updateByNamedQuery(@Param("age") int age);

}
