import java.io.*;
import java.util.*;

public class BookDT {
    private HashMap<String, Book> bookMap;

    public BookDT() throws FileNotFoundException {
        Scanner bookInfo = new Scanner(new FileReader("Book.csv"));

        bookMap = new HashMap<>();

        while(bookInfo.hasNext()){
            String rowBook = bookInfo.nextLine();
            String[] rowBookSpecific = rowBook.split(",");

            Book book1 = new Book();
            book1.setIsbn(rowBookSpecific[0].trim());
            book1.setTitle(rowBookSpecific[1].trim());
            book1.setAuthorName(rowBookSpecific[2].trim());

            bookMap.put(book1.getIsbn(), book1);
        }
        bookInfo.close();
    }

    public HashMap<String, Book> getBookMap(){
        return bookMap;
    }
}
