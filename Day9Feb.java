public class Day9Feb {
    static void CountNumbers(){
        int num = 123456789;
        int count = 0;
        while(num>0){
            int rem = num%10;
            count++;
            num=num/10;
        }
        System.out.println("Total Numbers are: "+count);
    }

    static void Maxnumber(){
        int a[] = {2,4,11,2,6};
        int a2[] = {-1,-9,-7,-3,-11,0};
        int max=0;
        int max2 = Integer.MIN_VALUE;
        // for(int i=0;i<a.length;i++){
        //   if(a[i]>max){
        //     max=a[i];
        //   }
        // }
        for(int i=0;i<a2.length;i++){
          if(a2[i]>max2){
            max2=a2[i];
          }
        }
        System.out.println("The maximum number in the array "+max2);
    }
    public static void main(String[] args) {
        // CountNumbers();
        Maxnumber();
    } 
}
