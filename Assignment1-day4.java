Question 1:

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String name,power,weapon,planet;
    int age;
    Avengers[] avengers=new Avengers[5];
    for(int i=0;i<5;i++){
        avengers[i]=new Avengers();
        avengers[i].getDetails();
        }
    for(int i=0;i<5;i++){
        avengers[i].display();
    }
    }

}

import java.util.Scanner;
public class Avengers {
    String name,power,weapon,planet;
    int age;
    Scanner sc=new Scanner(System.in);
    public void getDetails(){
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter Age:");
        age=sc.nextInt();
        System.out.println("Enter Power:");
        power=sc.next();
        System.out.println("Enter Weapon:");
        weapon=sc.next();
        System.out.println("Enter Planet:");
        planet=sc.next();
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Power:"+power);
        System.out.println("Weapon:"+weapon);
        System.out.println("Planet:"+planet);
    }
}


 



Question 2:

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a[]=new int[5];
   System.out.println("Enter the array values:");
   for(int i=0;i<5;i++){
       a[i]=sc.nextInt();
    }
        for(int i=0;i<5;i++){
            if(a[i]%2!=0){
                System.out.println("The odd numbers in the array are "+a[i]);
            }
        }
    }
}

output:
Enter the array values:
2
4
8
7
9
The odd numbers in the array are 7
The odd numbers in the array are 9








Question 3:

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int sum=0;
   int n=0;
   System.out.println("Enter n value:");
   n=sc.nextInt();
   int b[]=new int[n];
   System.out.println("Enter Array Elements:");
   for(int i=0;i<n;i++){
       b[i]=sc.nextInt();
    }
   for(int i=0;i<n;i++){
       sum=sum+b[i];
   }
   System.out.println("The sum is:"+sum);
    }
}

output:
Enter n value:
6
Enter Array Elements:
1
2
3
4
5
6
The sum is:21