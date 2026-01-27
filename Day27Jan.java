import java.util.*;
public class Day27Jan{
    static void CountEachChar(String str[]){
        Arrays.sort(str);
        System.out.println(""+Arrays.toString(str));
        int count=1;
        for(int i=0;i<str.length-1;i++){
            if(str[i]==str[i+1]){
               count++;
            }
            else{
                System.out.println(str[i]+" : "+count);
                count=1;
            }
        }
        System.out.print(str[str.length-1]+" : "+count);

    }
    public static void main(String[] args) {
        String a[] = {"a","b","a","e","d","a"};
        CountEachChar(a);
    }
}