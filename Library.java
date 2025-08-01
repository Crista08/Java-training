abstract class Item{
    private String title;
    private String author;
    Item(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
        abstract void display();
}
class Book extends Item implements Readable{
    private String genre;
    Book(String title,String author,String genre){
        super(title,author);
        this.genre=genre;
    }
    public String getGenreName(){
        return genre;
    }
    public void read(){
        System.out.println("Beautiful Story!");
    }
    public void display(){
        System.out.println("Title : "+getTitle());
        System.out.println("Author : "+getAuthor());
        System.out.println("Genre : "+getGenreName());
    }
}
class BorrowedBook extends Book{
   private String borrowerName;
    private String dueDate;
    BorrowedBook(String title,String author,String genre,String borrowerName,String dueDate){
        super(title,author,genre);
        this.borrowerName=borrowerName;
        this.dueDate=dueDate;
    }
    public String getBorrowerName(){
        return borrowerName;
    }
    public String getDueDate(){
        return dueDate;
    }
    public void display(){
         System.out.println("Title : "+getTitle());
        System.out.println("Author : "+getAuthor());
        System.out.println("Genre : "+getGenreName());
        System.out.println("Borrower Name : "+borrowerName);
        System.out.println("Due Date : "+dueDate);
    }
}
interface Readable{
    void read();
    static void line(){
        System.out.println("I can draw a seedling with two tiny branches. Yours and mine. We'll be on our own brand-new, tiny family tree—one that starts with us!");
    }
}
class Library{
    public static void main(String args[]){
    BorrowedBook obj=new BorrowedBook("It Starts with US","Colleen Hoover","Romance","joe","Aug 01");
    obj.display();
    Readable.line();
    obj.read();
}
}