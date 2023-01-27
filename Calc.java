import java.util.*;
abstract class a{
         double x,y;
         a(double i,double j){
                  x=i;y=j;
         }
         abstract double c();
}

class add extends a{
         add(double i,double j){
              super(i,j);
         }
         double c(){
                return x+y;
        }
}

class sub extends a{
        sub(double i,double j){
                   super(i,j);
        }
        double c(){
                   return x-y;
        }
}

class mul extends a{
        mul(double i,double j){
                  super(i,j);
        }
        double c(){
                  return x*y;
        }
}

class div extends a{
    div(double i,double j){
        super(i,j);
    }
    double c(){
            if(y<=0){
                System.out.println("not possible");
                return 0;
            }
            else{
                return x/y;
            }
    }

}



class Calc{
        public static void main(String args[]){
                 Scanner sc=new Scanner(System.in);

                 System.out.println("Enter the numbers to add:");
                 double l=sc.nextInt();
                 double b=sc.nextInt();

                 System.out.println("Enter the numbers to substarct:");
                 double h=sc.nextInt();
                 double ba=sc.nextInt();

                 System.out.println("Enter the numbers to multiply:");
                 double a=sc.nextInt();
                 double x=sc.nextInt();

                 System.out.println("Enter the numbers to divuide:");
                 double u=sc.nextInt();
                 double v=sc.nextInt();


                 add r=new add(l,b);
                 sub t=new sub(h,ba);
                 mul c=new mul(a,x);
                 div d=new div(a,x);
                                  
                 System.out.println("sum is"+r.c());
                 System.out.println("substraction  is"+t.c());
                 System.out.println("multiplication  is"+c.c());
                 System.out.println("division is"+d.c());
       }
}
