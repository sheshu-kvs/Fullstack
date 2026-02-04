public class Day3Feb {

    static void printTitleCase(){
        String[] str={"maruti","deva","jeeva"}; 
        StringBuilder sb =new StringBuilder();
          
            String lower="";
        for (String  words : str) {
               String Upper="";
            for(int i=0;i<words.length();i++){
            //   System.out.println(words.charAt(i)+" : "+i);
              if(i==0){
                Upper = Upper+words.charAt(i);
                sb.append(Upper.toUpperCase());
              }
              else if(i==words.length()-1){
                sb.append(words.charAt(i)+" ");
              }
              else{
                sb.append(words.charAt(i));
              }
            }      
         }
         System.out.println(sb); 
           
        }

    public static void main(String[] args){
        printTitleCase();

    }    
}