import java.util.ArrayList;

public class TeacherService{
    protected static ArrayList<Teacher> list;

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
}