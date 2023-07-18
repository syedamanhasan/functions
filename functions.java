package JAVA;
import java.util.*;
public class functions {
    //returnType functionName(type arg1, type arg2..){ operation }

    public static void printName(Strings name){
        System.out.println(name);
        return;
    }


    public static int calculateMul(int a, int b){
        int mul = a*b;
        return mul;
    }




    public static int calculateFactorial(int n){
        int fact = 1;
        if(n<0){
            System.out.println("Invalid number for factorial");
        }else {
            for (int i = n; i > 0; i--) {
                fact = fact * i;
            }
        }
        return fact;
    }




    public static float calAvg(int a, int b, int c){
        float avg = (a+b+c)/3;
        System.out.println(avg);
        return avg;
    }




    public static int allOddSum(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            if(i%2!=0)
                sum=sum+i;
        }
        return sum;
    }




    public static void greater(int a, int b){
        if(a>b)
            System.out.println("a is greater");
        else if(b>a)
            System.out.println("b is greater");
        else
            System.out.println("both are equal");
    }




    public static double circumference(int r){
         double c = 3.14*r*r;
         return c;
    }




    public static int fabonacci(int n){
        int ft=0;
        int st=1;
        System.out.print(ft + " ");
        for(int i=0; i<=n; i++){
            int nt=ft+st;
            System.out.print(nt + " ");
            ft=st;
            st=nt;
        }
        return 1;
    }




    public static void infinite(int n){
        int i=0;
        do{
            System.out.println("This is an infinite loop");
        }while(i<=n);
    }




    public static void diffNumCount(int num){
        int positive=0; int negative=0; int zeros=0;
        for(int i=1; i<=num; i++){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n<0)
                negative = negative+1;
            else if(n>0)
                positive=positive+1;
            else{
                zeros = zeros +1;
            }
        }
        System.out.println("Number of positive numbers are:" + positive);
        System.out.println("Number of negative numbers are:" + negative);
        System.out.println("Number of zeros are:" + zeros);
    }



    public static void power(int x, int n){
        int a=1;
        for(int i=1; i<=n; i++){
            a = a*x;
        }
        System.out.println(a);
    }



    public static void main(Strings[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        power(x,n);
    }
}
