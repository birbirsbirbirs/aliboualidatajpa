package co.pitam.aliboualidatajpa.service;

import co.pitam.aliboualidatajpa.model.Author;
import co.pitam.aliboualidatajpa.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Cacheable(cacheNames = "cache1", key = "'#key1'")
    public List<Author> findAll() {
        log.info("returning AuthourService::findAll");
        return authorRepository.findAll();
    }

}
