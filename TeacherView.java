import java.util.ArrayList;
import java.util.Scanner;

public class TeacherView extends Teacher{

    public TeacherView(String name, String surname, String sphereOfDuty, int id) {
        super(name, surname, sphereOfDuty, id);
    }
    // public static void AddContact(){
    //     System.out.print("Enter the name: ");
    //     String name = sc.nextLine();
    //     System.out.print("Enter the surname: ");
    //     String surname = sc.nextLine();
    //     System.out.print("Enter the field of study: ");
    //     String sphereOfDuty = sc.nextLine();
    //     System.out.print("Enter the unique id: ");
    //     Integer id = sc.nextInt();
    //     Teacher te = new Teacher(name, surname, sphereOfDuty, id);
    //     TeacherService.AddContact(te);
    //     }

    //     public static void Redact(){
    //     System.out.print("Enter the name: ");
    //     String name = sc.nextLine();
    //     System.out.print("Enter the surname: ");
    //     String surname = sc.nextLine();
    //     System.out.print("Enter the field of study: ");
    //     String sphereOfDuty = sc.nextLine();
    //     System.out.print("Enter the unique id: ");
    //     Integer id = sc.nextInt();
    //     Teacher te = new Teacher(name, surname, sphereOfDuty, id);
    //     TeacherService.RedactContact(id, te);
    //     }

        public static void PrintAll(){
            TeacherService.PrintAll();
        }

        public static void PrintInfo(int id){
            TeacherService.PrintInfo(id);
        }

}
    