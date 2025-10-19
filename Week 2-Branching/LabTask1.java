import java.util.Scanner;
public class LabTask1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest_number = a;
        if(b>largest_number){
            largest_number = b;
        }
        if(c>largest_number){
            largest_number = c;
        }
        System.out.println("Largest number: "+largest_number);
    }
}
