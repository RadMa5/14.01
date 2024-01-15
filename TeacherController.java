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
                    TeacherView.AddContact();

                }
            } else {
                break;
            }

            

        }
    }
    
}
