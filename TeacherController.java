import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TeacherController{
    public static void run(){
        boolean work = true;
        
        TeacherService.Init();
        while(work){

            System.out.println("Welcome.");
            System.out.println("Choose one of the options below:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Redact a contact");
            System.out.println("3. Print the data of a specific contact");
            System.out.println("4. Print the list of all contacts");
            System.out.println("5. Leave");

            
                Scanner sc = new Scanner(System.in);
                int ch = sc.nextInt();
                switch(ch){
                    case 1:
                        Scanner s = new Scanner(System.in);
                        System.out.println("Enter the name: ");
                        String name = s.nextLine();

                        System.out.println("Enter the surname: ");
                        String surname = s.nextLine();

                        System.out.println("Enter the field of study: ");
                        String sphereOfDuty = s.nextLine();

                        System.out.println("Enter the unique id: ");
                        Integer id = s.nextInt();

                        Teacher te = new Teacher(name, surname, sphereOfDuty, id);
                        TeacherService.AddContact(te);
                        break;
                    case 2:
                        Scanner s2 = new Scanner(System.in);
                        System.out.print("Enter the unique id of a contacts to be changed: ");
                        Integer id2 = s2.nextInt();
                        Scanner s3 = new Scanner(System.in);
                        System.out.print("Enter the name: ");
                        String name2 = s3.nextLine();
                        
                        System.out.print("Enter the surname: ");
                        String surname2 = s3.nextLine();
                        Scanner s4 = new Scanner(System.in);
                        System.out.print("Enter the field of study: ");
                        String sphereOfDuty2 = s4.nextLine();
                        
                        Teacher te2 = new Teacher(name2, surname2, sphereOfDuty2, id2);
                        TeacherService.RedactContact(id2, te2);
                        break;
                    case 3:
                        System.out.print("Input the teacher's id: ");
                        TeacherView.PrintInfo(sc.nextInt());
                        break;
                    case 4:
                        TeacherView.PrintAll();
                        break;
                    case 5:
                        work = false;
                        break;
                }
            }
        }
    }
