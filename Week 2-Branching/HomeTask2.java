import java.util.Scanner;
public class HomeTask2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Payment: ");
       double payment = sc.nextInt();
       System.out.println("Enter Age: ");
       int age = sc.nextInt();
       double tax = 0;
       if(payment < 10000 || age < 18){
        System.out.println("Your Tax amounts in 0 Tk");
       }
       else if (payment >=10000 && payment<=20000 && age>=18){
        tax = payment*0.05;
        System.out.println("Your Tax amounts in "+tax+ " Tk");
       }
       else if(payment>20000){
        tax = payment*0.1;
        System.out.println("Your Tax amounts in "+tax+ " Tk");
       }
    }
}
