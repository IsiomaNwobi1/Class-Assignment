package week5_curriculum.class_exercise_4A;

import week5_curriculum.class_exercise_3A.BooksHashMap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BooksList> book = new ArrayList<>();


        BooksList book1 = new BooksList(23, "Where is HEAVEN?", "Stella Boo", 6);
        BooksList book2 = new BooksList(25, "Ever Green", "Chris Trust", 10);
        BooksList book3 = new BooksList(30, "ME and you", "Delia Luke", 5);
        BooksList book4 = new BooksList(27, "Praises", "Clement Amed", 8);
        BooksList book5 = new BooksList(31, "Love in Lost", "John Won", 4);

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);

        }
    }

