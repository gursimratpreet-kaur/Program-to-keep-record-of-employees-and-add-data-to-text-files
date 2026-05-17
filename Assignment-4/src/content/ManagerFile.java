/* Name: Gursimratpreet Kaur
Student ID: 991845418
Assignment-4
Date Completed: April 5, 2026*/

package content;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManagerFile {
    private static String MANAGERFILE = "Manager.dat";
    private static String EMPLOYEEFILE = "Employee.dat";
    

    //To create two sequential files
    public static void setManager(ArrayList <Manager> Managers)throws IOException{
        FileWriter fw = new FileWriter(MANAGERFILE);
        BufferedWriter bw = new BufferedWriter(fw);

        for(Manager m :Managers ){
            String record = m.getID() + "," + m.getDays();
            bw.write(record);
            bw.newLine();
        }
        bw.close();
        fw.close();

        FileWriter fwE = new FileWriter(EMPLOYEEFILE);
        BufferedWriter bwE = new BufferedWriter(fwE);

        for(Manager m : Managers){
            String record = m.getID() + "," + m.getName() + "," + m.getCity() + "," + m.getPay();
            bwE.write(record);
            bwE.newLine();
        }
        bwE.close();
        fwE.close();
    }
}
