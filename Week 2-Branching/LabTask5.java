import java.util.Scanner;
public class LabTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        int fx = 0;
        if(x < 0){
            fx = 2*x;
        }
        else if(x >= 0 && x < 2){
            fx = x+1;
        }
        else if(x >= 2 && x < 5){
            fx = x*x-1; 
        }
        else if(x >= 5){
            fx = 3*x*x+2;
        }
        System.out.println("f(x) = "+fx);
    }
}
