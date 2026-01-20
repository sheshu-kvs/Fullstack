import java.util.Scanner;
public class Day19Jan {
     public void EvenOrOdd(int num){
        if(num%2==0){
            System.out.println("Even Number...");
        }
        else{
            System.out.println("Odd Number...");
        }

    }
    public static void main(String[] args){
          Day19Jan d1 =  new Day19Jan();
          Scanner scan = new Scanner(System.in);
          System.out.println();
          System.out.println("Enter the Number:");
          int num = scan.nextInt();
          d1.EvenOrOdd(num);
    }
    
}
