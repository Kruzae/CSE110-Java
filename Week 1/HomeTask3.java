import java.util.Scanner;
public class HomeTask3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Id: ");
    int StudentId = sc.nextInt();
    int result1 = StudentId%10;
    int result2 = (StudentId/10)%10;
    System.out.println(result1);
    System.out.println(result2);
    }
}
