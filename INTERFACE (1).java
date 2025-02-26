interface Interface1
{
    static void method1()
    {
        System.out.println("Static Method");
    }
    default void method2()
    {
        System.out.println("Default Method");
    }
    void method3();
}
interface Interface2 extends Interface1
{
    static void method1()
    {
        System.out.println("Static Method");
    }
    default void method4()
    {
        System.out.println("Default Method");
    }
    void method3();
}
class INTERFACE implements Interface2
{
    public void method3()
    {
        System.out.println("Abstract Method");
    }
    public static void main(String args[])
    {
        INTERFACE obj = new INTERFACE();
        Interface1.method1();
        Interface2.method1();
        obj.method2();
        obj.method4();
        obj.method3();
    }
}
