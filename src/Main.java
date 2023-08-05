import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define Scanner method
        Scanner scanner = new Scanner(System.in);

        // Questions
        String question1 = "Ciao, come ti chiami?";
        String question2 = "Piacere di conoscerti, da dove vieni?";
        String question3 = "Bel posto! E quanti anni hai?";

        // First Q&A
        System.out.println(question1);
        String name = scanner.nextLine();
        
        // Second Q&A
        System.out.println(question2);
        String country = scanner.nextLine();
        
        // Third Q&A
        System.out.println(question3);
        int age = scanner.nextInt();
        scanner.nextLine();

        // Report printing
        System.out.println("Quindi se ho capito bene ti chiami " + name + ", hai " + age + " anni e vieni da " + country + "!");
    }
}
