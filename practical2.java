/*
DSA - COMP1002
RAIHAN KHALIL ABDILLAH
17900375
RECURSIVE FUNCTIONS
*/

import java.util.*;

public class practical2{
    public static void main(String[] args){

        int selection = 100000;
        int val1,val2,val3;
        Scanner sc = new Scanner(System.in);
        
        while(selection != 0){

            System.out.println("1 = factorial\n2 = fibbonacci\n3 = greatest common denominator\n4 = base conversion\n5 = tower of hanoi\n6 = tower of hanoi of lecture slides\n0 = exit program");
            selection = sc.nextInt();

            switch(selection){
                case 1:
                    System.out.print("Input value for factorial recursion calculation: ");
                    val1 = sc.nextInt();
                    System.out.println(factorial(val1));
                    break;
                case 2:
                    System.out.print("Input value for fibbonacci recursion calculation: ");
                    val1 = sc.nextInt();
                    System.out.println(fibbonacci(val1));
                    break;
                case 3:
                    System.out.println("Input value1 and value2 for greatest commond denominator calculation.");
                    System.out.print("value1: ");
                    val1 = sc.nextInt();
                    System.out.print("value2: ");
                    val2 = sc.nextInt();
                    System.out.println(gcdRecursive(val1, val2));
                    break;
                case 4:
                    System.out.println("Input value1 and value2 for decimal to any base (2-16) conversion.");
                    System.out.print("decimal: ");
                    val1 = sc.nextInt();
                    System.out.print("base (2-16): ");
                    val2 = sc.nextInt();
                    System.out.println(baseConversion(val1, val2));
                    break;
                case 5:
                    System.out.print("Input the number of disk: ");
                    val1 = sc.nextInt();
                    towerOfHanoi(val1);
                    break;
                case 6:
                    System.out.print("Input the number of disk: ");
                    val1 = sc.nextInt();
                    System.out.print("Input the source tower number: ");
                    val2 = sc.nextInt();
                    System.out.print("Input the destination tower number: ");
                    val3 = sc.nextInt();
                    towers(val1, val2, val3);
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("wrong selection.");
            }
        }


        sc.close();
    }

    public static long factorial(int a){

        long fac = 1;

        if (a < 0)
            throw new IllegalArgumentException("Value must not be negative.");
        else if (a == 0)
            fac = 1;
        else
            fac =  a * factorial(a - 1);
        return fac;
    }

    public static long fibbonacci(int a){

        long fibVal = 0;

        if (a < 0)
            throw new IllegalArgumentException("Value must not be negative.");
        else if (a == 0)
            fibVal = 0;
        else if (a == 1)
            fibVal = 1;
        else
            fibVal = fibbonacci(a - 1) + fibbonacci(a - 2);
        return fibVal;

    }

    // lifted from geeksforgeeks.org
    // https://www.geeksforgeeks.org/javascript/javascript-program-to-find-g-c-d-using-recursion/
    public static int gcdRecursive(int a, int b){

        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Values must not be negative.");
        else if (b == 0)
            return a;
        return gcdRecursive(b, a % b);
        

    }

    // lifted from geeksforgeeks.org
    // https://www.geeksforgeeks.org/dsa/decimal-binary-number-using-recursion/
    // public static int baseConversion(int a, int b){

    //     if (a == 0)
    //         return 0;
    //     if (b <= 10)
    //         return (a % b + 10 * baseConversion(a/b, b));
    //     else
    //         return 0;
    // }


    // lifted from https://stackoverflow.com/questions/20150901/convert-decimal-to-hex-using-recursive-method-java
    public static String baseConversion(int a, int b){

        String result = "";
        int remainder = a % b;

        if (a < 0 )
            throw new IllegalArgumentException("Decimal value must not be negative.");
        else if (b <= 2 || b >= 17)
            throw new IllegalArgumentException("Base value must be within 2 - 16.");
        else if (a == 0)
            return "0";
        else
            switch (remainder) {
                case 10:
                    result = "A";
                    break;
                case 11:
                    result = "B";
                    break;
                case 12:
                    result = "C";
                    break;
                case 13:
                    result = "D";
                    break;
                case 14:
                    result = "E";
                    break;
                case 15:
                    result = "F";
                    break;
                default:
                    result = Integer.toString(remainder);
                    break;
            }
            return baseConversion(a / b, b) + result;
    }
    

    // lifted from https://www.geeksforgeeks.org/dsa/c-program-for-tower-of-hanoi/
    // youtube visualisation https://www.youtube.com/watch?v=YstLjLCGmgg
    public static void towerOfHanoi(int a){

        if (a < 0)
            throw new IllegalArgumentException("Number of disks must be above 0.");
        moveDisk(a, '1', '3', '2');
    }

    private static void moveDisk(int n, char src, char dest, char aux){

        if (n == 0)
            return;

        moveDisk(n-1, src, aux, dest);

        System.out.println("Moving disk " + n + " from Source " + src + " to Destination " + dest);
        System.out.println("n=" + n + ", src=" + src + ", dest=" + dest);
        System.out.println();

        moveDisk(n-1, aux, dest, src);

    }

    // lecture slide's pseudo code
    public static void towers(int n, int src, int dest){

        int temp;
        if (n == 1)
            moveDsk(n, src, dest);
        else {
            temp = 6 - src - dest;

            towers(n-1, src, temp);
            moveDsk(n, src, dest);
            towers(n-1, temp, dest);
        }
    }
    public static void moveDsk(int n, int src, int dest){

        System.out.println("Moving disk " + n + " from Source " + src + " to Destination " + dest);
        System.out.println("n=" + n + ", src=" + src + ", dest=" + dest);
        System.out.println();
    }
    
}
