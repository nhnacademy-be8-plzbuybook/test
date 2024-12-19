package com.nhnacademy.book.booktest.service;

import com.nhnacademy.book.book.dto.request.BookRegisterDto;
import com.nhnacademy.book.book.repository.BookRepository;
import com.nhnacademy.book.book.service.Impl.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @InjectMocks
    private BookService bookService;

    @MockBean
    private BookRepository bookRepository;

    @Test
    void registerBook() {
        BookRegisterDto bookRegisterDto = new BookRegisterDto();

    }





}
