package exercises;

public class Switch {

    public static void main(String[] args) {
        String today = "Tuesday";

        switch (today.toLowerCase()) {
            case "monday": System.out.println("segunda");
            case "tuesday": System.out.println("terca");
            case "wednesday": System.out.println("quarta");
            case "thursday": System.out.println("quinta");
            case "friday": System.out.println("sexta");
            case "saturday": System.out.println("sabado");
            case "sunday": System.out.println("domingo");
            default: System.out.println("not a valid day");
        }
    }
}
