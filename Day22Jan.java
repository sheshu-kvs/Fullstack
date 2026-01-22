public class Day22Jan {
    static void reversenumber(){
        int num = 123;
        int rev = 0;
        while(num>0){
          int rem = num%10;
          rev = rev * 10 + rem;
          num = num/10;
        }
        System.out.println("revese number "+rev);
    }
    static void checkpalindrome(){
         int num = 121;
         int original = num;
         int rev = 0;
        while(num>0){
          int rem = num%10;
          rev = rev * 10 + rem;
          num = num/10;
        }
        if(rev == original){
            System.out.println("Entered number was the Palindrome "+rev);
        }
        else{
            System.out.println("Enterd number was not the palindrome "+rev);
        }
    }
    public static void main(String args[]){
        //   reversenumber();
          checkpalindrome();
    }
    
}
