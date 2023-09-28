package homework;

public class Main {


    public static void main(String[] args) {

        Book.getBookAuthor();

        Book bookOne = new Book("Animal farm", 1945);

        System.out.print("Book Title = " + bookOne.bookTitle +", ");
        System.out.println("Years = " + bookOne.age);

        Book.getBookAuthor1();

        Book bookTwo = new Book("Brave New World",1932);
        System.out.print("Book Title = " + bookTwo.bookTitle +", ");
        System.out.println("Years = " + bookTwo.age);



    }
}
