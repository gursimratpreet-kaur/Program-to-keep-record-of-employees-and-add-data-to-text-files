/* Name: Gursimratpreet Kaur
Student ID: 991845418
Assignment-4
Date Completed: April 5, 2026*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import content.Manager;
import content.ManagerFile;
import content.ProcessManager;

public class App {
    public static void main(String[] args)throws Exception{

        Scanner k = new Scanner(System.in);
        
        ArrayList <Manager> managerList = new ArrayList<Manager>();
        String choice = "";
        do{
            System.out.println("1. Display Managers");
            System.out.println("2. Add Manager");
            System.out.println("3. Find Manager");
            System.out.println("4. End Program");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = k.next();

            if(choice.equals("1")){
                if(managerList.isEmpty()){
                    System.out.println("No Manager to display");
                }
                else{
                    System.out.printf("%-8s %-12s %-12s %-12s %-12s" , "ID" ,"Name" , "City" , "Days Worked" , "Pay");
                    System.out.println();
                    for(Manager m : managerList){
                        System.out.printf("%-8s %-12s %-12s %-12s %-12s", m.getID(), m.getName(), m.getCity(), m.getDays() ,m.getPay());
                        System.out.println();
                    }
                
                }
            }
            else if(choice.equals("2")){
                System.out.println();
                System.out.print("Enter ID: ");
                int id = k.nextInt();
                while(ProcessManager.checkID(id,managerList)){
                    System.out.print("Enter unique ID: ");
                    id = k.nextInt();
                }

                k.nextLine();
                Manager one = new Manager(id);
                
                System.out.print("Enter Name: ");
                String name = k.nextLine();
                one.setName(name);

                System.out.print("Enter City: ");
                String city = k.nextLine();
                one.setCity(city);

                System.out.print("Enter days worked: ");
                int days = k.nextInt();
                while(days < 0 || days > 7){
                    System.out.print("Days must be between 0 and 7: ");
                    days = k.nextInt();
                }
                one.setDays(days);

                managerList.add(one);
            }

            else if(choice.equals("3")){
                System.out.print("Enter ID: ");
                int id = k.nextInt();
                System.out.println();
                Manager one = ProcessManager.findMangers(id, managerList);
                if(one.getID() == -999){
                    System.out.println("Manager not found!");
                }
                else{
                    System.out.println(ProcessManager.findMangers(id, managerList));
                    System.out.println("Manager: " + one.getID());
                    System.out.println("Name: " + one.getName());
                    System.out.println("City: " + one.getCity());
                    System.out.println("Pay: " + one.getPay());
                    
                }   
            }
            //for any other choice
            else if(!choice.equals("4")){
                System.out.println("Invalid Choice!");
            }

        }
        while(!choice.equals("4"));
        try{
            ManagerFile.setManager(managerList);
        }
        catch(IOException e){
            System.err.println(e);
        }
        k.close();
        System.out.println();
        System.out.println("Name: Gursimratpreet Kaur");
        System.out.println("Student ID: 991845418");
    }
}
