
package Main;

import static Main.Main.lp;
import Userdashboard.Userdashboard;
import Validation.Validation;
import java.util.Scanner;



public class Main {
    
    public static Scanner lp = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        System.out.println("WELCOME TO MY SYSTEM");
        System.out.println("1. login: ");
        System.out.println("2. Register: ");
        System.out.println("3. Exit: ");
        
        System.out.print("Choose an optoin: ");
        int option = lp.nextInt();
        lp.nextLine();
        
        Validation ud = new Validation();

       switch(option){
         
             case 1:
                 ud.login();
                 break;
             
             case 2:
                 ud.Register();
                 break;
 

       }
      
}

public static void logindashboard(){
    
    
    System.out.println("WELCOME TO MY SYSTEM");
         System.out.println("1. Add User");
         System.out.println("2. View User");
         System.out.println("3. Update User");
         System.out.println("4. Delete User");
         System.out.println("5. Approve");
         System.out.println("6. Exit");

         System.out.print("\nChoose an option: ");
         int option = lp.nextInt();
         lp.nextLine();

        Userdashboard ud = new Userdashboard();

       switch(option){
       
       case 1:
          ud.adduser();
          break;
        case 2:
          ud.viewuser();
           break;
        case 3:
            ud.viewuser();
            ud.updateuser();
            break;
        case 4:
            ud.viewuser();
            ud.deleteuser();
            break;
         case 5:
           ud.viewuser();
           ud.approveuser();
            break;
         case 6:
             main(null);
             break;
        
       
       }
      

}

}