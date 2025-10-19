import java.util.Scanner;
public class HomeTask5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount the customer need to pay(Taka)");
        int amountpay = sc.nextInt();
        System.out.println("Enter the amount customer gave(Taka)");
        int amountgiven = sc.nextInt();
        int change = 0;
        int hundred = 0, fifty = 0, twenty = 0, ten = 0, five = 0, two = 0, one = 0;
        if(amountgiven == amountpay){
            System.out.println("The returned amount is 0 Taka");
        }
        else if(amountgiven < amountpay){
            int due = amountpay-amountgiven;
            System.out.println("Please give "+due+" Taka more");
        }
        else{
            change = amountgiven-amountpay;
            System.out.println("The returned amount is "+change+"Taka");
            
            if(change>=hundred){
                hundred = change/100;
                change = change%100;    
            }
            if(change>=fifty){
                fifty = change/50;
                change = change%50;
            }
            if(change>=twenty){
                twenty = change/20;
                change = change%20;
            }
            if(change>=ten){
                ten = change/10;
                change = change%10;
            }
            if (change>=five){
                five = change/5;
                change = change%5;
            }
            if(change>=two){
                two = change/2;
                change = change%2;
            }
            if (change>=one){
                one = change/1;
                change = change%1;
            }
            System.out.println("100 Taka note: "+hundred);
            System.out.println("50 Taka note: "+fifty);
            System.out.println("20 Taka note: "+twenty);
            System.out.println("10 Taka note: "+ten);
            System.out.println("5 Taka note: "+five);
            System.out.println("2 Taka note: "+two);
            System.out.println("1 Taka note: "+one);
        }
    }
}
