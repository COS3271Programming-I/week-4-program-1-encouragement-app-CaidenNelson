import java.util.Scanner;

public class EncouragementApp {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {

        int age;
        String wellbeing;

        System.out.println("How old are you?");
        age = userinput.nextInt();
        userinput.nextLine();

        System.out.println("How are you doing today? Good, bad, or neutral?");
        wellbeing = userinput.nextLine();
        wellbeing = wellbeing.toLowerCase();

        if (age < 20 && wellbeing.equals("bad")) {System.out.println("How can I help?");}
        if (age < 20 && wellbeing.equals("good")) {System.out.println("Tell me what went well today?");}
        if (age < 20 && wellbeing.equals("neutral")) {System.out.println("Is there something I can do to cheer you up?");}
        if (age > 20 && wellbeing.equals("good")) {System.out.println("You did great today");}
        if (age >20 && wellbeing.equals("bad")) {System.out.println("What went wrong?");}

    }
}
