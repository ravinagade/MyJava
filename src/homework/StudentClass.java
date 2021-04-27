package homework;

public class StudentClass {

    public static void main(String[] args) {
        Student mark = new Student();
        mark.id = 1;
        mark.name = "Mark";
        mark.age = 15;

        Student Tom = new Student();
        Tom.id = 2;
        Tom.name = "Tom";
        Tom.age = 14;

        System.out.println(mark.name + " is " + mark.age + " years old");
        System.out.println(Tom.name + " is " + Tom.age + " years old");

    }
}