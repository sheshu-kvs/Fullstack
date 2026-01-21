public class Day21Jan {
    static void factorial(){
        int num = 3;
        int fact=1;
        // while(num>0){
        //     fact = fact*num;
        //     num--;
        // }
        
        // System.out.println("The Factorial of the Number "+fact);
        /*Using the For loop */
        for(int i=num;i>0;i--){
            fact=fact*i;
        }
 System.out.println("The Factorial of the Number "+fact);

    }

    public static void main(String[] args) {
        factorial();
    }
    
}
