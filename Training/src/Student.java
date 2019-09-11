import java.util.Scanner;
public class Student{

        String name,address;
        int age;
Student()
        {
            this.name="unknown";
            this.address="-";
            this.age=0;
        }
        void setinfo(int ag, String n)
        {
            this.name = n;
            this.age = ag;
        }
        void setinfo(String n, String a, int ag)
        {
            this.name = n;
            this.address = a;
            this.age = ag;
        }
        //to get the information, you should not pass the informations
        void getinfo()
        {
            System.out.println("Name: "+name);
            System.out.println("age: "+age);
            System.out.println("Address: "+address);
        }


public static void main(String args[])
{
int a,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter no of students");
   a=sc.nextInt();
   Student[] s=new Student[a];
    
    for(i=0;i<a;i++)
    {
    s[i]=new Student();
    System.out.println ("Enter age and name ");
        s[i].setinfo(sc.nextInt(),sc.next());
    }
    
    for(i=0;i<a;i++)
    {
        s[i].getinfo();
    }
   
    
    for(i=0;i<a;i++)
    {
    System.out.println("Enter name,address and age");
        s[i].setinfo(sc.next(),sc.next(),sc.nextInt());
    }
    
    for(i=0;i<a;i++)
    {
        s[i].getinfo();
    }
}
}
