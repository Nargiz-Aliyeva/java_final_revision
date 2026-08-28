import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args){

      /*  Scanner scanner = new Scanner(System.in);
       int a =-2;


        if (a>0){
    System.out.println(a +"is posetive number");
}
       else {
            System.out.println(a+ "is negative number");
        }
*/

     /*   int a = 5;
        if (a>0){
            System.out.println(a + "is posetive number");
        }
else {
            System.out.println(a + "is negative number");
        }
*/





        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number ");
        int a = scanner.nextInt();
        if (a>0){
            System.out.println(a + " is posetive number");
        }
        else if (a<0){
            System.out.println(a + " is negative number");
        }
        else if(a==0){
            System.err.println(a+ " is zero");
        }

*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number ");
        int a= scanner.nextInt();
        if (a>0){
            System.out.println(a + " is posetive number");
        }
        else {
            if (a<0)
            {  System.out.println(a + " is negative number");
        }
        else {
            System.err.println(a + " is equal  zero");
        }

        }


    }


    }
