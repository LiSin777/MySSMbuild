import com.qing.pojo.Books;
import com.qing.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mytest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);
        List<Books> booksList = bookService.selectBook();
        for (Books books : booksList) {
            System.out.println(books);
        }
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);
        bookService.addBook(new Books(1 , "11" , 5 , "555"));
        List<Books> books = bookService.selectBook();
        for (Books book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);
        bookService.updateBook(new Books(5 , "77" , 5 , "555"));
        List<Books> books = bookService.selectBook();
        for (Books book : books) {
            System.out.println(book);
        }
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = context.getBean("bookService", BookServiceImpl.class);
        Books books = bookService.seleBookByID(1);
        System.out.println(books);
    }
}
