import java.io.*;
import java.util.*;

public class AuthorDT {
    private HashMap<String, Author> authorMap;

    public AuthorDT() throws FileNotFoundException {
        Scanner authorInfo = new Scanner(new FileReader("Author.csv"));

        authorMap = new HashMap<>();

        while(authorInfo.hasNext()){
            String rowAuthor = authorInfo.nextLine();
            String[] rowAuthorSpecific = rowAuthor.split(",");

            Author author = new Author();
            author.setName(rowAuthorSpecific[0].trim());
            author.setBio(rowAuthorSpecific[1].trim());

            authorMap.put(author.getName(), author);
        }
        authorInfo.close();
    }

    public HashMap<String, Author> getAuthorMap(){
        return authorMap;
    }
}
