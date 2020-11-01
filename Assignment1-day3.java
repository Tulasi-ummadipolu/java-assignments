Day-3 Assignment-2 Question-1

import java.util.Scanner;
import java.lang.Integer;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	int sum=0;
	for(int i=0;i<5;i++){
	    a[i]=sc.nextInt();
    }
	for(int i=0;i<5;i++){
	    sum=sum+a[i];
    }
	System.out.println("The total marks are: "+sum);
	float k=(sum/5);
	int n=(int) Math.round(k);
	if(n<100 && n>90) {
	    System.out.println("The Grade is A");
        System.out.println("The percentage is "+n);
	}
	else if(n<90 && n>80) {
	    System.out.println("The Grade is B");
        System.out.println("The percentage is "+n);
	}
	else if(n<80 && n>70) {
	    System.out.println("The Grade is C");
        System.out.println("The percentage is "+n);
	}
	else if(n<70 && n>60) {
	    System.out.println("The Grade is D");
        System.out.println("The percentage is "+n);
	}
	else if(n<60 && n>50) {
	    System.out.println("The Grade is E");
        System.out.println("The percentage is "+n);
	}
	else{
	    System.out.println("Failed");
        System.out.println("The percentage is "+n);
	}
    }
}
output:-
85
95
65
75
54
The total marks are: 374
The Grade is C
The percentage is 74




Question-2

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Employee d=new Employee();
	String name;
	int date,month,year,age;
	double n;
	float monthly_salary;
	d.name=sc.next();
	date=sc.nextInt();
	month=sc.nextInt();
	year=sc.nextInt();
	monthly_salary=sc.nextFloat();
	d.age=2020-year;
	if(monthly_salary==5){
		d.n=500000*0.2;
		d.display();
    }
	else if(monthly_salary==4){
		d.n=400000*0.15;
	    d.display();
	}
	else if(monthly_salary==3){
	    d.n=300000*0.1;
	    d.display();
	}
    else if(monthly_salary==2){
        d.n=200000*0.05;
        d.display();
    }
    }
}

public class Employee {
    public String name;
    public int age;
    public double n;
    public void display(){
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
        System.out.println("The Tax paid is "+n);
    }
}

output:-

ravi
5
8
1996
4
The name is ravi
The age is 24
The Tax paid is 60000.0