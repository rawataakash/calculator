package calculator;

import java.util.Scanner;


public class calculator {

public static void add(int a,int b){
int d=a+b;
System.out.print("required output is : "+d);
}
 public static void sub(int a,int b){
     if(a>=b){
         
int d=a-b;
System.out.print("the required out put is :"+ d);
     }else{
     System.out.println("Please enter the first  no greater then second no");}

}
public  void mult(int a,int b){
int d=a*b;
System.out.print("the required out put is :"+ d);
}
public void div(int a,int b){
    if(b!=0){
int d=a/b;
System.out.print("the required out put is :"+ d);
    }else{
    System.out.println("the value entered should not be zero ");
}  
}  public static void main(String[] args) {
calculator c=new calculator();
Scanner sc =new Scanner(System.in);
System.out.println("Enter the first number a:");
int a=sc.nextInt();
System.out.println("Enter the second number b:");
int b=sc.nextInt();
System.out.println("Enter the  operation number (+,-,*,/): ");
int d=sc.nextInt();
switch(d){
    case 1: 
        c.add(a,b);
        break;
    case 2:
        c.sub(a,b);
        break;
    case 3:
        c.mult(a, b);
        break;
    case 4:
        c.div(a,b);break;
    default : System.out.println("Invalid data....... ");
    
}

 
 

}
    
}