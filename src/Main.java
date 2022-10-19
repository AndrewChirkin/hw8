import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Author AndrzejSapkowski = new Author("Анджей","Сапковский");
    Author KirBulichev = new Author("Кир","Булычев");
    Book LastWish = new Book("Последнее желание",AndrzejSapkowski,1993);
    Book Village = new Book("Посёлок",KirBulichev,1988);
        System.out.println(LastWish);
        System.out.println(Village);
        LastWish.setPublicationYear(2021);
        System.out.println(LastWish);
    }
}