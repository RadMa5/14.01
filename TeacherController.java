import java.util.Scanner;

public class TeacherController{
    public void run(){
        
        TeacherService.Init();
        while(true){

            System.out.println("Welcome.");
            System.out.println("Choose one of the options below:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Redact a contact");
            System.out.println("3. Print the data of a specific contact");
            System.out.println("5. Print the list of all contacts");

            
            var con = System.console();
            if(con != null){
                Scanner sc = new Scanner(con.reader());
                int ch = sc.nextInt();
                switch(ch){
                    case 1:
                        System.out.print("Enter the name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter the surname: ");
                        String surname = sc.nextLine();
                        System.out.print("Enter the field of study: ");
                        String sphereOfDuty = sc.nextLine();
                        System.out.print("Enter the unique id: ");
                        Integer id = sc.nextInt();
                        Teacher te = new Teacher(name, surname, sphereOfDuty, id);
                        TeacherService.AddContact(te);
                        break;
                    case 2:
                        System.out.print("Enter the name: ");
                        String name2 = sc.nextLine();
                        System.out.print("Enter the surname: ");
                        String surname2 = sc.nextLine();
                        System.out.print("Enter the field of study: ");
                        String sphereOfDuty2 = sc.nextLine();
                        System.out.print("Enter the unique id: ");
                        Integer id2 = sc.nextInt();
                        Teacher te2 = new Teacher(name2, surname2, sphereOfDuty2, id2);
                        TeacherService.RedactContact(id2, te2);
                        break;
                    case 3:
                        System.out.print("Input the teacher's id: ");
                        TeacherService.PrintInfo(sc.nextInt());
                        break;
                    case 4:
                        TeacherService.PrintAll();
                        break;
                    

                }
            } else {
                break;
            }

            

        }
    }
    
}
