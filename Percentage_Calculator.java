import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        System.out.println("Grade Card");
        Scanner sc = new Scanner(System.in);

        int math, phy, chem, bio, eng;

        do {
            System.out.println("Enter Marks: ");
            System.out.print("Mathematics: ");
            math = sc.nextInt();
        } while (math < 0 || math > 100);

        do {
            System.out.print("Physics: ");
            phy = sc.nextInt();
        } while (phy < 0 || phy > 100);

        do {
            System.out.print("Chemistry: ");
            chem = sc.nextInt();
        } while (chem < 0 || chem > 100);

        do {
            System.out.print("Biology: ");
            bio = sc.nextInt();
        } while (bio < 0 || bio > 100);

        do {
            System.out.print("English: ");
            eng = sc.nextInt();
        } while (eng < 0 || eng > 100);

        int total = math + phy + chem + bio + eng;
        System.out.print("Total Marks: ");
        System.out.println(total);
        double percentage = ((double)total / 500) * 100;
        System.out.print("You've secured ");
        System.out.print(percentage);
        System.out.print("% marks");

        sc.close();
    }
}
