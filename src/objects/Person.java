package objects;

public class Person {
    private final String FIRSTNAME;
    private final String LASTNAME;
    private int AGE;

    public Person(String firstName, String lastName) {
        this.FIRSTNAME = firstName;
        this.LASTNAME = lastName;
    }

    public Person(String firstName, String lastName, int age) {
        this.FIRSTNAME = firstName;
        this.LASTNAME = lastName;
        this.AGE = age;
    }
}
