import java.util.ArrayList;
public class Main {
    public static void main(String[]args)
    {
        ArrayList<Student> AL = new ArrayList();
        AL.add(new Student("Vi",1));
        AL.add(new Student("An",2));
        AL.add(new Student("Al",3));
        AL.add(new Student("Js",4));
        AL.add(new Student("Le",5));
        for(Student s:AL)
        {
            System.out.println(s.getName() +" "+s.getRollno());
        }
    }
}