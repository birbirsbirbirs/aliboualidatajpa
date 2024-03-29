package co.pitam.aliboualidatajpa.config;

import co.pitam.aliboualidatajpa.model.Author;
import co.pitam.aliboualidatajpa.repository.AuthorRepository;
import co.pitam.aliboualidatajpa.specification.AuthorSpecification;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDateTime;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class PitamCommandLineRunner implements CommandLineRunner {
    private final AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {
        Author alibouAuthor = Author.builder()
                .firstName("alibou")
                .lastName("alibou")
                .age(34)
                .email("alibou@gmail.com")
                .createdAt(LocalDateTime.now())
                .build();
        authorRepository.save(alibouAuthor);
        /*
         * dummy data populate
         *  */
        for (int i = 0; i < 50; i++) {
            authorRepository.save(Author.builder()
                    .firstName("alibou" + i)
                    .lastName("alibou" + i)
                    .age(34)
                    .email("alibou" + i + "@gmail.com")
                    .createdAt(LocalDateTime.now())
                    .build());
        }

//        update author with ID 1
        authorRepository.save(Author.builder()
                .id(1)
                .firstName("alibou100")
                .lastName("alibou100")
                .age(34)
                .email("alibou" + 100 + "@gmail.com")
                .createdAt(LocalDateTime.now())
                .build());

//        update author a set a.age=22 where a.id=2
        authorRepository.updateAuthor(22, 2);

//        update age of all author
        authorRepository.updateAllAuthorAges(99);

//        find by named query
        authorRepository.findByNamedQuery(60).forEach(System.out::println);

        authorRepository.updateByNamedQuery(25);

        Specification<Author> spec = Specification.where(AuthorSpecification.hasAge(25))
                .and(AuthorSpecification.finstnameContains("alibou5"));
        authorRepository.findAll(spec).forEach(System.out::println);

        Specification<Author> spec1 = Specification.where(AuthorSpecification.finstnameContains("alibou10"));
        authorRepository.findAll(spec1).forEach(System.out::println);


    }
}
