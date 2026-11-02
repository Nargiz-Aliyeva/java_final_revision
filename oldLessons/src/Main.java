import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      /*      // loop
           int a =1;
            while (a<=10){
                System.out.println(a);
                a++;
            }
            int n = 3;
            while (n<=10){
                System.out.println(n);
                n++;
            }
            int m = 10;
        while (n>=1){
            System.out.println(n);
            n--;

        }
        int l = 1;
        while (l<=10){
            System.out.println(l);
            l+=2;
        }
        int i=1;
        int j =5;
        while (i<10&&j<10){
            System.out.println("i= "+i+"j= "+j);
            i++;
            j++;
        }
        // for
        for (int w=1;w<=10;w++){
            if (w%2==0){
                System.out.println("cut");
            }else {
                System.out.println("tek");
            }

            System.out.println(w);
        }

for (int e=10;e>=1;e--){
    System.out.println(e);
}

int r = 78;
if (r%2==0){
    System.out.println("cut");
}else {
    System.out.println("tek");
}

        Scanner scanner = new Scanner(System.in);
      //  int z = scanner.nextInt();
       for (int y=1; y<=10;y++ ){
           System.out.println(y +"*"+z+"="+z*y);
       }







//nested loop
       for (int z =1 ;z<=10; z++ ){
           for (int y=1; y<=10;y++ ){
               System.out.println(y +"*"+z+"="+z*y);
           }

       }

        //birde et
       for (int a=5 ; a>=1 ; a--){
           for (int b = 1; b<=5;b++){
               System.out.println("a = "+a+", b = "+b);
           }
       }
  */
        for (int a = 1; a <= 50; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                System.out.println(a);
            }
        }
//birden ona qeder olan edelerin cemi
     /*   int sum = 0;
        for (int b = 1; b <= 10; b++) {
            sum += b;
        }
        System.out.println(sum);
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                break;

            }
            System.out.println(i);
        }
*/
//her xanaya nece bugda qoyulur ve vece umumi bugda qoyulur
/*
Long bugdaSayi = 1L;
for (int i = 1 ; i<=64; i++){
    System.out.println("xana ="+i+",bugda = "+bugdaSayi);
    bugdaSayi*=2;
}*/


        BigInteger bugdaSayi = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 1; i <= 64; i++) {
            System.out.println("xana =" + i + ",bugda = " + bugdaSayi);
            sum=sum.add(bugdaSayi);
            System.out.println("sum="+sum);
            bugdaSayi = bugdaSayi.multiply(BigInteger.valueOf(2));

        }

    }
}





// githubdan qeyd
    /*
git status
git add .
git commit -m "Son dəyişikliklər"
git push

git push origin main

git push

son deyisikliler elave olunsun deye


     */











