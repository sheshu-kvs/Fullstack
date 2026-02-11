class a{
    void disp(){
        System.out.print("Printing A value");
    }
}
class b extends a{
    // void disp(){
    //     System.out.println("Printing B Value");
    // }
}


public class Day11Feb {
    public static void main(String[] args) {
        a Avalue = new a();
        b Bvalue = new b();
        Avalue.disp();
        Bvalue.disp();
        
    }
    
}
