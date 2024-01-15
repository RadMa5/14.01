
public class TeacherView{

        public static void PrintAll(){
            System.out.println("List of all teachers:");
            TeacherService.PrintAll();
        }

        public static void PrintInfo(int id){
            TeacherService.PrintInfo(id);
        }

}
    