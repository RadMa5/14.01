import java.util.ArrayList;

public class TeacherView extends TeacherService{

        public static void PrintAll(){
        ArrayList<Teacher> list = TeacherService.GetList();
        for (int i = 0; i < list.size(); i ++){
            TeacherView.PrintInfo(i + 1);
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
    