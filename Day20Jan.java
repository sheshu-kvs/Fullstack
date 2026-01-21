 /*Print The Prime Numbers  */

public class Day20Jan {
    static boolean CheckPrime(int num){
        if(num<0){
            return false;
        }
       int count=0;
       for(int i=1;i<=num;i++){
        if(num%i==0){
           count++;
        }
       }
       if(count==2){
        // System.out.println("Enterd Number is the Prime..");
        return true;
       }
      return false;
    }
    static void PrintAllPrimeNumbers(){
        int num = 100;
        int count=0;
        for(int i=0;count<num;i++){
            if(CheckPrime(i)){
               System.out.println("Prime "+i);
               count++;
            }
        }
    }
    static void TwoTable(){
        int num = 20;
         System.out.println("Multiplication Of the 2 Table::");
        for(int i=1;i<=num;i++){
            if(i%2==0){
               
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        //    Day20Jan.TwoTable();
           Day20Jan.PrintAllPrimeNumbers();
    }
}
