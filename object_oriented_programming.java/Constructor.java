public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit", 12, 18);
        // Student("Rohit", 12, 18); -> This is constructor call
        //OR, Student(); -> This is constructor call
        s1.getDetails();
        
    }
}

class Student{
    String std_name;
    int std_class;
    int std_age;

    // creating a constructor
    Student(String std_name, int std_class, int std_age){
        this.std_name = std_name;
        this.std_class = std_class;
        this.std_age = std_age;
    }

    void getDetails(){
        System.out.println("Name: " + this.std_name);
        System.out.println("Class: " + this.std_class);
        System.out.println("Age: " + this.std_age);
    }
}
