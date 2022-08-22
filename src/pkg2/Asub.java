package pkg2;
import pkg1.*;

public class Asub extends A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultMessage); // can be accessed, because besides defaultMessage don`t use a modifier,
        // it is in the same package

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage); // protected keyword allows subclasses access

        //UNMARK//System.out.println(c.privateMessage); // Besides C is the same package, C private accessors cannot be accessed
        // outside C class
    }
}
