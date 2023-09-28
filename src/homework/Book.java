package homework;

public class Book {

    private String bookTitle;
    private int age;

    public Book(String bookTitle, int age) {
        this.bookTitle = bookTitle;
        this.age = age;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public Integer getAge(){
        return this.age;
    }
    public void setAge (int age){
        this.age = age;
    }

    public static void getBookAuthor() {
        Author bookOne = new Author("George", "Orwell");

        System.out.print("Author = " + bookOne.getName() + " " + bookOne.getSurname() + ", ");
    }

    public static void getBookAuthor1() {
        Author bookTwo = new Author("Aldous", "Huxley");

        System.out.print("Author = " + bookTwo.getName() + " " +  bookTwo.getSurname());
    }

}
