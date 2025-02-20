import java.util.Scanner;
class Book{
    String Book_title;
    float Book_price;
    Book()
    {
        Book_title="Java programming";
        Book_price=100.0f;
    }
    void display()
    {
        System.out.println("Book title:"+Book_title);
        System.out.println("Book price:"+Book_price);
    }
    public static void main(String args[]){
        Book b=new Book();
        b.display();
    }
}