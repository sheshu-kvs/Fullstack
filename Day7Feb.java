import java.util.Arrays;

public class Day7Feb {
    static void reverseeachword(String str[]){
          int k=0;
          String reverseword[] = new String[str.length];
         for(String words:str){
            String t="";
            
            for(int i=words.length()-1;i>=0;i--){
                t=t+words.charAt(i);
            }
            // System.out.println(t);
            reverseword[k++]=t;
        }
        System.out.println("Arrays Data Stored in the String  "+Arrays.toString(reverseword));
    }

    
    public static void main(String[] args) {
        String str[]={"Java","sterio","memo"};
        reverseeachword(str);
    }
    
}
