package com.ferdev.belajarspringbootbuku;

import com.ferdev.belajarspringbootbuku.entity.Book;
import com.ferdev.belajarspringbootbuku.entity.BookCategory;
import com.ferdev.belajarspringbootbuku.repository.BookCategoryRepository;
import com.ferdev.belajarspringbootbuku.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.SpringDataJacksonConfiguration;

import java.util.List;
import java.util.function.UnaryOperator;

@SpringBootApplication
public class BelajarSpringBootBukuApplication implements CommandLineRunner {


	@Autowired
	private BookRepository repository;

	private final Logger LOG = LoggerFactory.getLogger(BelajarSpringBootBukuApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BelajarSpringBootBukuApplication.class, args);
	}

	// nama method query harus sama dengan nama column

//	public void run(String... args){ // insert data
//		Book book1 = new Book();
//		book1.setTitle("sikancil");
//		book1.setWrite("joko");
//		book1.setIsbn("IS-9091");
//
//		Book book2 = new Book();
//		book2.setTitle("gembala nakal");
//		book2.setWrite("joko");
//		book2.setIsbn("IS-9092");
//
//		repository.save(book1);
//		repository.save(book2);
//
//		LOG.info("berhasil menyiman " + book1);
//		LOG.info("berhasil menyiman " + book2);
//
//	}

//	public void run(String... args){ // select *
//		List<Book> books = repository.findAll();
//
//		books.forEach(
//				book -> {
//					System.out.println(book.getId());
//					System.out.println(book.getIsbn());
//					System.out.println(book.getTitle());
//					System.out.println(book.getWrite());
//				}
//		);
//
//		LOG.info("book : " + books);
//	}


//	@Override
//	public void run(String... args) throws Exception { // getByIsbn where isbn = ?
//		String isbn = "IS-9091";
//		Book book = repository.findByIsbn(isbn);
//
//
//		LOG.info("books : " + book.getIsbn());
//
//	}


//	@Override
//	public void run(String... args) throws Exception {
//		List<Book> books = repository.findAllByWrite("joko");
//
//		for(Book buku : books) {
//			System.out.println(buku.getIsbn());
//			System.out.println(buku.getIsbn());
//		}
//	}


//	@Override
//	public void run(String... args) throws Exception { // cari berdasarkan title
//
//		Book book = repository.findByTitle("sikancil");
//
//		LOG.info(book.getTitle());
//
//	}


//	@Override
	// jika menggunakan native query, harus menambahkan anotation query dan tambahkan
	// value nativequery= true, dan isi query diatas method
//	public void run(String... args) throws Exception {  // find all / select native query
//		List<Book> books = repository.findAllNativeQuery();
//		for(Book book : books){
//			System.out.println(book.getIsbn());
//			System.out.println(book.getIsbn());
//		}
//	}

//	@Override
//	public void run(String... args) throws Exception { // cari dgn native query by writer
//		List<Book> books = repository.findALlByWriterNativeQuery("joko");
//
//		for(Book book : books){
//			System.out.println(book.getIsbn());
//			System.out.println(book.getIsbn());
//		}
//	}


//	@Override
//	public void run(String... args) throws Exception {
//		List<Book> books = repository.findAllByWrite("joko");
//		LOG.info("book : " + books);
//	}

	@Autowired
	private BookCategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		BookCategory bookCategory = categoryRepository.save(
				new BookCategory("pemrograman", new Book("Java 1","Teten N.","SEI92002"),
				new Book("Java 2","Teten N.","UEOEI829")
			));

	}
}
