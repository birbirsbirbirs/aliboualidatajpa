package co.pitam.aliboualidatajpa.config;

import co.pitam.aliboualidatajpa.model.Author;
import co.pitam.aliboualidatajpa.model.PitamVideo;
import co.pitam.aliboualidatajpa.repository.AuthorRepository;
import co.pitam.aliboualidatajpa.repository.PitamVideoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class PitamCommandLineRunner implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final PitamVideoRepository pitamVideoRepository;
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
        PitamVideo pitamVideo = PitamVideo.builder().name("abc").length(125).build();
        pitamVideoRepository.save(pitamVideo);
    }
}
