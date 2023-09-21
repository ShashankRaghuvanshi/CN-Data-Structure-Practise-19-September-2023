package Lecture_1_OOPS_1.Important_Keywords.classes_and_objects;

public class StudentUse 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Ankush",123);
        s1.print();

        Student s2 = new Student("Manisha",130);
        s2.print();

        System.out.println(s1.getNumStudent());
        System.out.println(Student.getNumStudent());
        // Student.numStudent = 10;
    }
}
