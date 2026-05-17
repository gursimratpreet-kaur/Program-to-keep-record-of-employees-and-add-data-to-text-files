/* Name: Gursimratpreet Kaur
Student ID: 991845418
Assignment-4
Date Completed: April 5, 2026*/

package content;

public  abstract class Employee {
    private int id= 0;
    protected Employee(int id){
        this.id = id;
    }
    public int getID(){
        return this.id;
    }

    private String name = "";
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    private String city = "";
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }

    protected double pay= 0;
    public double getPay(){
        calculatePay();
        return this.pay;
    }

    protected abstract void calculatePay();
}
