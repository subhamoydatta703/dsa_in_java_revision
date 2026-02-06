package object_oriented_programming;

public class Static_keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolname = "BWU";
        
        Student s2 = new Student();
        System.out.println(s2.schoolname);
    
    }
}


class Student{
    String name;
    static String schoolname;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}