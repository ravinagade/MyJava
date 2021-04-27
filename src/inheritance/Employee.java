package inheritance;

public class Employee {

    int id;
    String name;
    String email;
    int mobile;

    public static String show(){
        return "Hello";
}
public static void main(String[] args) {
    Employee employee = new Employee();
    employee.id = 1;
    employee.email = "ravinagade@gmail.com";
    employee.name = "Ravina";
    employee.mobile= 7218257;
    System.out.println(employee.email);
}

}
