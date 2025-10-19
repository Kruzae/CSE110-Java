import java.util.Scanner;
public class HomeTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float MaxNum = num1;
        float MinNum = num1;
        if(num2>MaxNum){
            MaxNum = num2;
        }
        if(num3>MaxNum){
            MaxNum = num3;
        }
        if(num2<MinNum){
            MinNum = num2;
        }
        if (num3<MinNum){
            MinNum = num3;
        }
        System.out.println("Maximum number is "+MaxNum);
        System.out.println("Minimum number is "+MinNum);
    }
}
