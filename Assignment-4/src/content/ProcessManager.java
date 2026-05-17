/* Name: Gursimratpreet Kaur
Student ID: 991845418
Assignment-4
Date Completed: April 5, 2026*/

package content;

import java.util.ArrayList;

public class ProcessManager {
    public static boolean checkID(int id , ArrayList <Manager> managerList){
        for(Manager m : managerList){
            if(id == m.getID()){
                return true;
            }
        }
        return false;
    }
    public static Manager findMangers(int id , ArrayList <Manager> managerList){
        for(Manager m : managerList){
            if(id == m.getID()){
                return m;
            }
        }
        
        Manager two = new Manager(-999);
        return two;        
    }
}