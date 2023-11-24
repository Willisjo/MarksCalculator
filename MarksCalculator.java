import java.util.Scanner;

public class MarksCalculator {
    
    public static void main(String args) {
        calculateAverageMarks();
    }

    public static void calculateAverageMarks() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for Java Programming: ");
        int javaMarks = scanner.nextInt();
        
        System.out.print("Enter marks for Networking: ");
        int networkingMarks = scanner.nextInt();
        
        System.out.print("Enter marks for Maths: ");
        int mathsMarks = scanner.nextInt();
        
        double averageMarks = (double) (javaMarks + networkingMarks + mathsMarks) / 3;

        System.out.println("Marks for Java Programming: " + javaMarks);
        System.out.println("Marks for Networking: " + networkingMarks);
        System.out.println("Marks for Maths: " + mathsMarks);
        System.out.println("The average is: " + averageMarks);
    }
}








