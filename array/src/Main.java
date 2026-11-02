import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*    System.out.println("hi");
        BigInteger bugdaSayi = BigInteger.valueOf(1);
        BigInteger sum= BigInteger.valueOf(0);
        for (int i =1;i<=64; i++){
            System.out.println("xana = "+i+" bugda ="+bugdaSayi);
            sum = sum.add(bugdaSayi);
            System.out.println("sum = "+ sum);
bugdaSayi = bugdaSayi.multiply(BigInteger.valueOf(2));

*/
//-------------------------------------------------------------------------------------------
        // array
        // 1 den cox deyeri 1 variableye set elemek ucun istifade olur
        // javada type safety qorunur

        /*int[]myFirstArray={21,52,54,12,76};
        System.out.println(myFirstArray[0]);
        System.out.println(myFirstArray.length);//uzunlugu istesek
        for (int i=0;i<=4;i++){
            System.out.println(myFirstArray[i]);
        }

        int [] mySecondArray = {12,13,14,15,11,10};
        for (int e=0;e<=5 ;e++){
            System.out.println(mySecondArray[e]);
        }

        int[]myNumberList={1,2,3,4,5,6,7,8,9};
        for (int i=8;i>=0;i--){
            System.out.println(myNumberList[i]);
        }
        bir birinin cemi
        int[]numberList =  {23, 5, 47, 12, 36, 8, 19, 41};
        int sum = 0;
        for (int i=0 ; i<numberList.length; i++){
            sum+=numberList[i];
        }
        System.out.println(sum);


        int []list={31, 4, 25, 42, 13, 37, 2, 29};
        int sum=0;
        for (int i=0;i<list.length;i++){
            sum+=list[i];
        }
        System.out.println(sum);

        int[] arr ={21,31,42,53,54,65,66};
        int sum =0;
        for (int i =0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);


    int[] myInt= new int[3];
    //System.out.println(myInt.length);
myInt[0]=1;
myInt[1]=5;
myInt[2]=3;
        //System.out.println(myInt[2]);
        int sum = 0;
for (int i =0; i<myInt.length; i++){
    //System.out.println(myInt[i]);
    sum+=myInt[i];
}
        System.out.println(sum);


String[] myString = new String[2];
System.out.println(myString[0]);

        String[] myStrings ={"Nargiz","Rasul", "Aydan", "Taleh"};
        System.out.println(myStrings[0]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter usurname");
        String givenUser = scanner.next();
        String[] myStrings ={"Nargiz","Rasul", "Aydan", "Taleh"};
        for (int i =0;i< myStrings.length;i++){
            if (givenUser.equals(myStrings[i])){
                System.err.println(givenUser+" alredy used");
                break;
            }
            int[][] myArr={{2,3},
                    {4,5},
                    {7,8}};
           // System.out.println(myArr[0][1]);

        System.out.println(myArr[2][1]);


//birde bax mutleq
        String[][] users = {
                {"taleh", "12345"},
                {"rasul","12"},
                {"vusal","23"},
        };
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter pls");
        String username = scanner.next();
        System.out.println(" enterpass");
        String pasword = scanner.next();
boolean state = true;
      for ( int i =0; i< users.length;i++){
          //System.out.println(users[i][0]);
          //System.out.println(users[i][1]);
          if (username.equals(users[i][0])&&pasword.equals(users[i][1])){
              System.out.println("welcome "+username);
             state=false;
              break;
          }
      }
      if (state){
          System.err.println("user not found")
          ;}
          */
/*


    String[][]users={
            {"Nergiz","1"},
            {"Fatima","2"},
            {"hesderxan","3"}
    };
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username please");
        String username = scanner.next();
        System.out.println("Enter your password please");
        String password = scanner.next();
        boolean state = true;
    for (int i =0;i< users.length ; i++){
        if (username.equals(users[i][0])&&password.equals(users[i][1])){
            System.out.println("welcome "+ username);
            state = false;
break;
        }
    }
        if (state){
            System.err.println("user not found");

        }


 */
        /*


    int[] arr={1,3,4,5,6,7,8,9,12,11,9} ;
    int counter =0;
        for (int i =0 ; i<arr.length;i++){
            if (arr[i]%2==0){
                counter++;
            }
        }
        System.out.println(counter);

int []arr2 = new int[counter];
        System.out.println(arr2.length);


*
        /*



int[]arr ={1,3,4,5,6};
int maximum = arr[0];
for (int i =0 ; i<arr.length ; i++){
    if (arr[i]>maximum){
        maximum =arr[i];
    }
}
        System.out.println(maximum);
*/
        int[]arr={1,2,3};
int sum = 0;
for (int i =0;i< arr.length;i++){
    sum+=arr[i];

}
        System.out.println(sum/arr.length);






    }



    }

























