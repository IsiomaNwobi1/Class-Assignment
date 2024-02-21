package week5_curriculum.class_exercise_3A;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, BooksHashMap> book = new HashMap<>();

        BooksHashMap book1 = new BooksHashMap(23, "Where is HEAVEN?", "Stella Boo", 6);
        BooksHashMap book2 = new BooksHashMap(25, "Ever Green", "Chris Trust", 10);
        BooksHashMap book3 = new BooksHashMap(30, "ME and you", "Delia Luke", 5);
        BooksHashMap book4 = new BooksHashMap(27, "Praises", "Clement Amed", 8);
        BooksHashMap book5 = new BooksHashMap(31, "Love in Lost", "John Won", 4);

        book.put(1, book1);
        book.put(2, book2);
        book.put(3, book3);
        book.put(4, book4);
        book.put(5, book5);

        for (Map.Entry f : book.entrySet()) {
            System.out.println(f.getKey() + " " + f.getValue());
        }
    }
}
