package com.ll.domain.book.book.service;

import com.ll.domain.book.book.entity.Book;
import com.ll.domain.book.book.repository.BookRepository;
import com.ll.domain.member.member.entity.Member;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BookService {
    private final BookRepository bookRepository;

    @Transactional
    public Book createBook(Member author, String title, String body, int price) {
        Book book = Book.builder()
                .author(author)
                .title(title)
                .body(body)
                .price(price)
                .build();

        bookRepository.save(book);

        return book;
    }
}
