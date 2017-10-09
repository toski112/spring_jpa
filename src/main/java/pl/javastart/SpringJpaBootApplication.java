package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.dao.BookDao;
import pl.javastart.model.Book;

import java.sql.SQLException;

@SpringBootApplication
public class SpringJpaBootApplication{

	public static void main(String[] args) throws InterruptedException, SQLException {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringJpaBootApplication.class, args);
		BookDao bookDao = ctx.getBean(BookDao.class);
		Book book = new Book("1234567890468", "Spring is so cool", "Javastart");
		bookDao.save(book);
		Thread.sleep(5000);

	}
}
