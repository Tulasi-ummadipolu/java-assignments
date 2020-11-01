import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employee d=new Employee();
    String name;
    int age;
    String city;
    d.name=sc.next();
    d.age=sc.nextInt();
    d.city=sc.next();
    d.display();
    Employee d1=new Employee();
    d1.name=sc.next();
    d1.age=sc.nextInt();
    d1.city=sc.next();
    d1.display();
    }
}


public class Employee {
    public String name;
    public int age;
    public String city;

    public void display()
    {
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The city is " +city);
    }
}
Output:-
tulasi
21
Vijayawada
The name is tulasi
The age is 21
The city is Vijayawada
Ravi
24
chennai
The name is Ravi
The age is 24
The city is chennai