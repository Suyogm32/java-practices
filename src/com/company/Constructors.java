package com.company;
class MyEmp{
    private int id;
    private String name;
    private int sal;

    //This is constuctor of class MyEmp Which will invoke automatically when object of class is created.
    public MyEmp(){
        id=10;
        name="Ashish Mahangade.";
        sal=43000;
    }

    //This is parametric constructor.
    public MyEmp(int Myid){
        id=9;
        name="Monkey D. Luffy ";
        sal=40000;
    }

    void setid(int i){
        id=i;
    }
    int getId(){
        return id;
    }
    void Setname(String n){
        name=n;
    }
    String getName(){
        return name;
    }
    void SetSal(int s){
        sal=s;
    }
    int getSal(){
        return sal;
    }

}

public class Constructors {
    public static void main(String[] args) {
       MyEmp sonu=new MyEmp(9);
       //sonu.setid(12);
       //sonu.Setname("Suyog Mahangade.");
      // sonu.SetSal(67000);
        System.out.println(sonu.getId()+"\t"+sonu.getName()+"\t"+ sonu.getSal());

    }
}
