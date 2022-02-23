package com.company;

class Employee{
    int id;
    int salary;
    String  name;
     public int getSalary(){
        return salary;
    }
     public String getName(){
        return name;
    }
     public String setName(String x){
         name=x;
        return name;
    }
}

class cellphone{
    public void ringcell(){ System.out.println("Ringing !"); }
    public void  vibratecell(){ System.out.println("Vibrating....."); }
    public void  call_a_friend(){ System.out.println("Calling to ramesh....."); }

}
class squre{
    int side;
    public int Area(){ return side*side; }
    public int perimeter(){ return 4*side; }
}
class rectangle{
    int l;
    int b;
    public int Area(){ return l*b; }
    public int perimeter(){
        int result= 2*(l+b);
    return result;
    }
}

class circle{
    int radius;
    public double Area(){ return (3.14*radius*radius); }
    public double perimeter(){ return (2*3.14*radius); }
}

public class Practise_Set_08 {
    public static void main(String[] args) {
        /*
        //Q1)
        Employee jay=new Employee();
        jay.id=01;
        jay.name="JAY KUMAR";
        jay.salary=45000;
        System.out.println("Name of employee is "+jay.getName());
        System.out.println(" and salary is "+jay.getSalary());
        System.out.println(jay.setName("RAM"));

        //Q2)
        cellphone realme=new cellphone();
        realme.ringcell();
        realme.vibratecell();
        realme.call_a_friend();
         */
        //Q3)
        squre obj1=new squre();
        obj1.side=13;
        System.out.println("Area of Squre is "+obj1.Area());
        System.out.println("Perimeter of Squre is "+obj1.perimeter());

        //Q4)
        rectangle rec=new rectangle();
        rec.l=14;
        rec.b=10;
        System.out.println("Area of rectangle is "+rec.Area());
        System.out.println("Perimeter of rectangle is "+rec.perimeter());

        //Q6)
        circle c=new circle();
        c.radius=10;
        System.out.println("Area of circle is "+c.Area());
        System.out.println("Circumference of circle is "+c.perimeter());


    }
}
