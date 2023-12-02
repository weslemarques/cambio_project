package br.com.wesle.bookservice.repository;

import br.com.wesle.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
