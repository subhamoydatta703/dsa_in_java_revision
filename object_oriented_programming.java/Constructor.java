public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Rohit", 12, 18);
        // Student("Rohit", 12, 18); -> This is constructor call
        // OR, Student(); -> This is constructor call
        s1.getDetails();
        Student s2 = new Student(s1);
        // only std_class is copy from s1 to s2
        // System.out.println(s2.std_class);
        s2.setName("Sumit");
        s2.setAge(19);
        s2.getDetails();

    }
}

class Student {
    String std_name;
    int std_class;
    int std_age;

    // creating a constructor
    Student(String std_name, int std_class, int std_age) {
        this.std_name = std_name;
        this.std_class = std_class;
        this.std_age = std_age;
    }

    void getDetails() {
        System.out.println("Name: " + this.std_name);
        System.out.println("Class: " + this.std_class);
        System.out.println("Age: " + this.std_age);
    }

    // copy constructor
    Student(Student s1) {
        this.std_class = s1.std_class;
    }

    void setName(String std_name) {
        this.std_name = std_name;
    }

    void setAge(int std_age) {
        this.std_age = std_age;
    }

}
