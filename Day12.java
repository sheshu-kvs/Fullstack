public class Day12{
    static void ReverseString(){
        String str="Hello Java";
        int i=str.length()-1;
        String t="";
        while(i>=0){
          char ch = str.charAt(i);
          t = t+ch;
          i--;
        }
        System.out.println("Reverse String:"+t);
    }
    public static void main(String[] args){
        ReverseString();
        System.out.println("Hello Java ");
    }
}