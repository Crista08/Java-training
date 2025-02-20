class Bookdetails
{
    String Title;
    String Author;
    float Price;
    Bookdetails(String Title,String Author,float Price)
    {
        this.Title=Title;
        this.Author=Author;
        this.Price=Price;
    }
    void display()
    {
        System.out.println("Title : "+Title);
        System.out.println("Author : "+Author);
        System.out.println("price : "+Price);
    }
    public static void main(String args[])
    {
        Bookdetails b=new Bookdetails("LIFE","Shakesphere",100.0f);
        b.display();
    }
}