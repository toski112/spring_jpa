package pl.javastart.dao;

import pl.javastart.model.Book;

import java.sql.SQLException;

public interface BookDao {
    public void save(Book books) throws SQLException;
    public Book get(Long id);
}