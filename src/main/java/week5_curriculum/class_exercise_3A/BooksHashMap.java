package week5_curriculum.class_exercise_3A;

public class BooksHashMap {
    private int id;
    private String Title;
    private String Author;
    private int numberOfBooks;

    public BooksHashMap(int id, String title, String author, int numberOfBooks) {
        this.id = id;
        Title = title;
        Author = author;
        this.numberOfBooks = numberOfBooks;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", numberOfBooks=" + numberOfBooks +
                '}';
    }
}
