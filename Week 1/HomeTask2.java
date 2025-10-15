import java.util.Scanner;
public class HomeTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = ((2*b)*(c-a)/3) + 7;
        System.out.println(d);
    }
    
}
