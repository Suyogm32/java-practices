package com.company;

class Emp{
    private int id;
    private String name;
    private int sal;
    void setid(int id){
        id=this.id;
    }
    int getId(){ return id; }
    void Setname(String n){ name=this.name; }
    String getName(){return name; }
    void SetSal(int sal){ sal=this.sal; }
    int getSal(){return sal;}

}
public class Getters_and_Setters {
    public static void main(String[] args) {
        Emp sonu=new Emp();
        sonu.setid(1);
        sonu.Setname("Suyog Mahangade.");
        System.out.println("ID of new Employee is "+sonu.getId());
        System.out.println("Name of Employee is "+sonu.getName());
        sonu.SetSal(54000);
        System.out.println("Salary of employee is "+sonu.getSal());

        Emp ram=new Emp();
        ram.setid(02);
        ram.Setname("Ram Mahanjan");
        System.out.println("ID of new Employee is "+ram.getId());
        System.out.println("Name of Employee is "+ram.getName());
        ram.SetSal(40000);
        System.out.println("Salary of employee is "+ram.getSal());


    }
}
