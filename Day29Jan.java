public class Day29Jan {
    static void reverString(){
        String str="Deva";
        String t="";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            t=t+ch;
        }
        System.out.println("Reverse String "+t);
    }
    static void CheckPlain(){
        String str="mam";
        String t="";
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            t=t+ch;
        }
        // System.out.println("Reverse String "+t);
        if(str.equals(t)){
            System.out.println("Palin String");
        }
        else{
            System.out.println("Not Palin");
        }

    }
    static void checkVowelsConsonants(){
        String str="devad";
        String lower = str.toLowerCase();
        for(int i=0;i<lower.length();i++){
            char ch = lower.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Vowels "+ch);
            }
            else{
                System.out.println("Consonents "+ch);
            }
        }
    }
    public static void main(String[] args){
        // reverString();
        CheckPlain();
        checkVowelsConsonants();
    }
    
}
