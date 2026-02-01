public class Day1Feb {
    static void removeSpecialCharacter(String str){
        String replace = str.replaceAll("\\s+ ","");
        String t="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!Character.isLetter(ch)){
              t=t+ch;
            }
        }
        System.out.println(t);
        System.out.println(replace);
    }
    public static void main(String[] args) {
       removeSpecialCharacter("hel   eo  !2#$");
    }
    
}
