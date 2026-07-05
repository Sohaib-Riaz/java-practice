public class Student{
    String name;
    int age;
    double gpa;
    Student(String n, int a , double g){
        name=n;
        age=a;
        gpa=g;
    }
    void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("Gpa : " + gpa);
    }
}
