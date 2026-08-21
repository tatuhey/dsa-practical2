import java.util.*;

public class practical2{
    public static void main(String[] args){

        int selection = 9;
        int val1,val2;
        Scanner sc = new Scanner(System.in);
        
        while(selection != 0){

            System.out.println("1 = factorial\n2 = fibbonacci\n3 = greatest common denominator\n4 = base conversion\n0 = exit program");
            selection = sc.nextInt();

            switch(selection){
                case 1:
                    System.out.println("Input value for factorial recursion calculation.");
                    val1 = sc.nextInt();
                    System.out.println(factorial(val1));
                    break;
                case 2:
                    System.out.println("Input value for fibbonacci recursion calculation.");
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
                    System.out.print("value1: ");
                    val1 = sc.nextInt();
                    System.out.print("base (2-16): ");
                    val2 = sc.nextInt();
                    System.out.println(baseConversion(val1, val2));
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

        if (a == 0)
            fac = 1;
        else
            fac =  a * factorial(a - 1);
        return fac;
    }

    public static long fibbonacci(int a){

        long fibVal = 0;

        if (a == 0)
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

        if (b == 0)
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


    // https://stackoverflow.com/questions/20150901/convert-decimal-to-hex-using-recursive-method-java
    public static String baseConversion(int a, int b){

        String result = "";
        int remainder = a % b;

        if (a == 0)
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
}
