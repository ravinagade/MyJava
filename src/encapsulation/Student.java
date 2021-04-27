package encapsulation;

public class Student {

    private int id=1;
    private String name="Rahul";
    private String adds="Pune";

    public static void main(String[] args){
    }

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAdds(String adds){
        this.adds=adds;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAdds(){
        return adds;
    }
}

class Main{
    public static void main(String[] args){
        Student student = new Student();

        System.out.println(student.getId());
        System.out.println(student.getAdds());
        System.out.println(student.getName());
    }
}

class Main1{
    public static void main(String[] args){
        Student student = new Student();

        System.out.println(student.getId());
    }
}
