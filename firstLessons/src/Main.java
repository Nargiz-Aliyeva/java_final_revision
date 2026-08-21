import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main(String[]args){
   // var username = "jet001";

    // 1 primitive data types int float , double, char
    // 2 none primitiv (wrapper) böyük
    int a =2;
    int b = 3;
    int c = a+b;
    //System.out.println(c);
    //boolean d = c>0;
  //  System.out.println(c>0);
int y = 23;
boolean t =true;
  /*  Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number:");
    int s = scanner.nextInt();
    System.out.print("Enter second number");
    int r = scanner.nextInt();
    System.out.println("Result:");
    System.out.println(s*r);*/
String username = "agent 007";

    System.out.println("welcome, "+ username);
    System.out.println("welcome, "+ username+3+5);
    System.out.println("welcome, "+ username+(3+5));
    int i =2;
    i+=6;
    System.out.println(i);
Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: ");

String name = scanner.next();
System.out.println(" Enter your age: ");
int age = scanner.nextInt();
    System.out.println(name+" "+ (age>18));

}

}