abstract class Joe
{
    abstract void disp();
    void display(){
        System.out.println("Outer class");
    }
    static abstract class Inner
    {
        abstract void meth();
        void method(){
            System.out.println("Inner");
        }
    }
}
class X extends Joe.Inner{
    public void meth(){
        System.out.println("Outer abstract");
    }
}
//class Y extends Inner{
   /* public void meth(){
        System.out.println("Inner meth");
    }*/
    //}
class AbstractInnerOuter{
    public static void main(String args[]){
        X obj=new X();
        obj.method();
        obj.meth();
    }
}