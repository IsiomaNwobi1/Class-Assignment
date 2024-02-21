package week5_curriculum.class_exercise_2A;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<BooksHashSet> book = new HashSet<>();

        BooksHashSet book1 = new BooksHashSet(231,"A MockingBird", "Isioma Nwobi",3);
        BooksHashSet book2 = new BooksHashSet(267,"Nightmare", "Ciel Belle",5);
        BooksHashSet book3 = new BooksHashSet(001,"A Song of Ice and Fire", "Sani Dogo",2);
        BooksHashSet book4 = new BooksHashSet(290,"Story of Belle", "Stella Boo",6);
        BooksHashSet book5 = new BooksHashSet(301,"Halleluyah", "Isi Honey",9);


        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        book.add(book5);

        for(BooksHashSet bk : book){
            System.out.println(bk);
        }
    }
}
