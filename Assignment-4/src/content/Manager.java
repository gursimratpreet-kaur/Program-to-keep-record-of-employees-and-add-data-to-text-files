/* Name: Gursimratpreet Kaur
Student ID: 991845418
Assignment-4
Date Completed: April 5, 2026*/

package content;

public class Manager extends Employee implements PayRates{
    public Manager(int id){
        super(id);
    }
    private int daysWorked = 0;

    //setdays throws Exception
    public void setDays(int days)throws Exception{
        if(days <0 || days > 7){
            throw new Exception ("Days must be between 0 and 7!");
        }
        else{
            this.daysWorked = days;
        }
    }
    public int getDays(){
        return this.daysWorked;
    }

    //To calculate Pay
    protected void calculatePay(){
        pay = daysWorked * MANAGER_RATE;
    }
}
