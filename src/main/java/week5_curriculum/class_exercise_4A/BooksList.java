package week5_curriculum.class_exercise_4A;

public class BooksList {

    private int ID;
    private String Title;
    private String Author;
    private int CopiesAvailable;

    public BooksList(int ID, String title, String author, int copiesAvailable) {
        this.ID = ID;
        Title = title;
        Author = author;
        CopiesAvailable = copiesAvailable;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getCopiesAvailable() {
        return CopiesAvailable;
    }

    @Override
    public String toString() {
        return "BooksList{" +
                "ID=" + ID +
                ", Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", CopiesAvailable=" + CopiesAvailable +
                '}';
    }
}
