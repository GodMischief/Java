import java.util.Scanner;

public class CGPA_Calculator {
    public static void main(String[] args) {
        System.out.println("CGPA Calculator");
        int sub1, sub2, sub3, sub4, sub5, sub6;
        Scanner sc = new Scanner(System.in);

        System.out.print("Marks obtained in Subject 1: ");
        sub1 = sc.nextInt();
        System.out.print("Marks obtained in Subject 2: ");
        sub2 = sc.nextInt();
        System.out.print("Marks obtained in Subject 3: ");
        sub3 = sc.nextInt();
        System.out.print("Marks obtained in Subject 4: ");
        sub4 = sc.nextInt();
        System.out.print("Marks obtained in Subject 5: ");
        sub5 = sc.nextInt();
        System.out.print("Marks obtained in Subject 6: ");
        sub6 = sc.nextInt();

        double cgpa = (double)(sub1 + sub2 + sub3 + sub4 + sub5 + sub6) / 60;

        System.out.print("CGPA: ");
        System.out.println(cgpa);
    }
}
