import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BookDT bookDT = new BookDT();
        AuthorDT authorDT = new AuthorDT();

        HashMap<String, Book> bookMap = bookDT.getBookMap();
        HashMap<String, Author> authorMap = authorDT.getAuthorMap();

        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            
            Book book = entry.getValue();
            System.out.println(book.getIsbn() + " " + book.getTitle());
            
            Author author = authorMap.get(book.getAuthorName());
                System.out.println("\t" + author.getName() + " - " + author.getBio());
        }
    }
}
