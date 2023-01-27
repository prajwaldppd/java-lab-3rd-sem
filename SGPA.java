import java.util.*;

class Student{
String usn,name;
Scanner sc = new Scanner(System.in);
Student(){
System.out.println("Enter your USN");
usn=sc.next();
System.out.println("Enter your Name");
name=sc.next();
}
int marks[]=new int[50];
int credits[]=new int[50];
int sum1=0;
int sum2=0;
void markenter(int x)
{
for (int i=0;i<x;i++){
System.out.println("Enter the marks in subject "+i+": ");
marks[i]=sc.nextInt();
System.out.println("Enter the credits in subject "+i+": ");
credits[i]=sc.nextInt();
sum1+=credits[i];
if (marks[i]>=90){
marks[i]=10;
}
else if (marks[i]>=80 && marks[i]<90)
{
marks[i]=9;
}
else if (marks[i]>=70 && marks[i]<80)
{
marks[i]=8;
}
else if (marks[i]>=60 && marks[i]<70)
{
marks[i]=7;
}
else if(marks[i]>=50 && marks[i]<60)
{
marks[i]=6;
}
else if(marks[i]>=40 && marks[i]<50)
{
marks[i]=5;
}
else
{
marks[i]=0;
}
}
}


double calc(int z)
{
for (int f=0;f<z;f++){
sum2+=marks[f]*credits[f];

}
return (sum2/sum1);
}
}


public class SGPA{
public static void main(String[] args){
Student stud=new Student();
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of subjects");
 int n=sc.nextInt();
stud.markenter(n);
System.out.println("SGPA scored is "+ stud.calc(n) );
}
}

