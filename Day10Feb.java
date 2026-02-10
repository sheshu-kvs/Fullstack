class student{
    private int id;
    private String name;
    private float marks;

    public void  setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(float marks){
        if(marks<=100){
            this.marks  = marks;
        }
        else{
            System.out.println("Please enter the valid marks(the marks always less than equal to 100) "+marks);
        }
    }

    // public void displaymarks(){
    //     if(marks<=100){
    //         System.out.println("Student got this marks "+marks);
    //     }
    //     else{
    //         System.out.println("Please enter the valid marks(the marks always less than equal to 100) "+marks);
    //     }
    // }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getMarks(){
        return marks;
    }

}


public class Day10Feb {
    public static void main(String[] args) {
        student stu = new student();
        stu.setId(12);
        stu.setName("Deva2351");
        stu.setMarks(102f);
        // stu.displaymarks();

       System.out.println("ID "+ stu.getId());
        System.out.println("Name "+stu.getName());
        System.out.println("Marks "+stu.getMarks());
        
    }
    
}
