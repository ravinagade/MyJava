package constructor_this_super;

public class Student {

    int id;
    String name;
    String add;

    public Student(int id, String name, String add){
        this.id = id;
        this.name = name;
        this.add = add;
        System.out.println("In constructor");
    }

    public Student(){

    }

    public static void main(String[] args){
        Student student = new Student(1, "Hari", "Pune");
        Student student1 = new Student(1, "Hari", "Pune");
        Student student2 = new Student(1, "Hari", "Pune");
        Student student3 = new Student(1, "Hari", "Pune");
        student.show();
    }
    private void show(){
        System.out.println("id-> " + id+ " name-> "+ name+ " add-> " + add);
    }
}
