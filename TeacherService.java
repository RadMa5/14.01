import java.util.ArrayList;

public class TeacherService extends Teacher{
    protected static ArrayList<Teacher> list;

    public TeacherService(String name, String surname, String sphereOfDuty, int id) {
        super(name, surname, sphereOfDuty, id);
    }

    public static void Init(){
        list = new ArrayList<>();
    }

    public static void AddContact(Teacher teacher){
        list.add(teacher);
    }

    public static void RedactContact(int id, Teacher teacher){
        list.set(id - 1, teacher);
    }

    public static ArrayList<Teacher> GetList(){
        return list;
    }

    public static void PrintAll(){
        ArrayList<Teacher> list = TeacherService.GetList();
        for (int i = 0; i < list.size(); i ++){
            System.out.println("List of all teachers");
            TeacherService.PrintInfo(i);
        }
    }

    public static void PrintInfo(int id){
        String[] lst = list.get(id-1).getInfo();
        for (String data : lst){
            System.out.println(data);
        }
        System.out.println();
    }
}