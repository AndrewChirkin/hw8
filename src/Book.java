import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int publicationYear;
    public Book(String title, Author author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getTitle(){
        return this.title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublicationYear(){
        return this.publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
    public String toString(){
        return "Книга - " + this.title + "\nАвтор - " + this.author + "\nГод публикации - " + this.publicationYear + "\n_________________";
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Book that = (Book) obj;
        return this.title.equals(that.title) && this.author.equals(that.author);
    }
    public int hashCode(){
        return Objects.hash(title,author,publicationYear);
    }

}

