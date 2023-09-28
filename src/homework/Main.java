package homework;

public class Main {


    public static void main(String[] args) {

        Book.getBookAuthor();

        Book bookOne = new Book("Animal farm", 1945);

        System.out.print("Book Title = " + bookOne.getBookTitle() +", ");
        System.out.println("Years = " + bookOne.getAge());
        bookOne.setAge(1946);
        System.out.println("Years = " + bookOne.getAge());

        Book.getBookAuthor1();

        Book bookTwo = new Book("Brave New World",1932);
        System.out.print("Book Title = " + bookTwo.getBookTitle() +", ");
        System.out.println("Years = " + bookTwo.getAge());



    }
}
