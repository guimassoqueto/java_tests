package pkg1;
import pkg2.*;
public class A {
    protected String protectedMessage = "Protected Message";
    public static void main(String[] args) {
        C c = new C();
        //UNMARK// System.out.println(c.defaultMessage); // cannot be accessed, because defaultMessage do not use any
        // access modifier
        System.out.println(c.publicMessage); // can be accesses, because it uses public keyword

        B b = new B();
        //UNMARK//System.out.println(b.privateMessage); // cannot be accessed, because it uses private keyword
    }
}
