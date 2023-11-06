/*package com.mycompany.foutoir.spring;

import com.senthrai.bookmarkerapi.domain.Bookmark;
import com.senthrai.bookmarkerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final BookmarkRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null, "senthrai", "https://senthrai.io", Instant.now()));
    }
}*/
