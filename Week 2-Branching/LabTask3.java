import java.util.Scanner;
public class LabTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        if( number % 5 == 0 && number % 7 == 0){
            System.out.println("Divisible by Both");
        }
        else if ( number % 5 == 0 && number % 7 != 0){
            System.out.println("Invalid: Divisible by 5 Only");
        }
        else if( number % 5 != 0 && number % 7 == 0){
            System.out.println("Invalid: Divisible by 7 Only");
        }
        else{
            System.out.println("No");
        }
    }
}
