import java.util.*;
public class Day2Feb {
    static boolean CheckAngarm(String s1,String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        return Arrays.equals(ch1,ch2);
    }
    public static void main(String[] args){
        String s1="sheshu";
        String s2="sheshu";
        if(CheckAngarm(s1,s2)){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal ");
        }

    }
    
}
