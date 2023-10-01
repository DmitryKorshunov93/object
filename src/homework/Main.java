package homework;

public class Main {


    public static void main(String[] args) {

        Author orwell = new Author("George", "Orwell");
        Author ouxley = new Author("Aldous", "Huxley");

        Book bookOne = new Book("Animal farm", 1945);

        System.out.println();
        System.out.print("Book Title - " + bookOne.getBookTitle() + ", Author - " + orwell.getName() + " " + orwell.getSurname() + ", ");
        System.out.println("Years - " + bookOne.getAge());
        bookOne.setAge(1946);
        System.out.println("Years = " + bookOne.getAge());


        Book bookTwo = new Book("Brave New World", 1932);
        System.out.print("Book Title = " + bookTwo.getBookTitle() + ", Author - " + ouxley.getName() + " " + ouxley.getSurname() + ", ");
        System.out.println("Years = " + bookTwo.getAge());


    }
}
