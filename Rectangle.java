class Rectangle
{
    float length;
    float width;
    Rectangle(float length,float width)
    {
        this.length=length;
        this.width=width;
    }
    Rectangle(Rectangle r)
    {
        this.length=r.length;
        this.width=r.width;
    }
    void display()
    {
        System.out.print(" Length : "+length);
        System.out.println("  Width : "+width);
    }
    public static void main(String args[])
    {
        Rectangle a=new Rectangle(10.0f,5.0f);
        a.display();
        Rectangle b=new Rectangle(a);
        b.display();
    }
}