package co.pitam.aliboualidatajpa.controller;

import co.pitam.aliboualidatajpa.model.Author;
import co.pitam.aliboualidatajpa.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/author")
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/findall")
    public List<Author> findAll() {
        return authorService.findAll();
    }
}
