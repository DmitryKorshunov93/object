package homework;

public class Book {

    String bookTitle;
    int age;

    public Book(String bookTitle, int age) {
        this.bookTitle = bookTitle;
        this.age = age;
    }

    public static void getBookAuthor() {
        Author bookOne = new Author("George", "Orwell");

        System.out.print("Author = " + bookOne.name + " " + bookOne.surname + ", ");
    }

    public static void getBookAuthor1() {
        Author bookTwo = new Author("Aldous", "Huxley");

        System.out.print("Author = " + bookTwo.name + " " +  bookTwo.surname);
    }

}
