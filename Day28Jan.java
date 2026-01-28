public class Day28Jan {
    static void SumOfNumber(){
       int num =123;
       int sum=0;
       while(num>0){
        int rem =num%10;
        sum=sum+rem;
        num=num=num/10;
       }
       System.out.println("Sum Of the Number "+sum);
    }
    static void FibOfNumber(){
        int first = 0;
        int second = 1;
        for(int i=0;i<7;i++){
            System.out.println(first);
            int temp = first + second;
            first = second;
            second = temp;
        }
    }
    static void  MultiPlicationOfTable(){
    }
    public static void main(String[] args) {
        SumOfNumber();
        FibOfNumber();
        MultiPlicationOfTable();
    }
}
