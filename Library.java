/*
code condtributed by - Raghav Vashishth
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
these functions have no return type. So these are to be used by making an object in the class.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
code contents:
1. A program to check wether a number is an armstrong number or not.(isArmstrong)
2. A program to check wether a number is a niven number or not.(isNiven)
3. A program to check wether a number is a perfect number or not.(isPerfect)
4. A program to check wether a number is a neon number or not.(isNeon)
5. A program to check wether a number is an automorphic number or not.(isAutomorphic)
6. A program to get the greatest common divisor of two numbers.(getGCD)
7. A program to get the least common multiple of two number.(getLCM)
8. A program to find wether a number is composite or not.(isComposite)
9. A program to get the smallest digit in a number.(getSmallestDigit)
10. A program to get the factorial of a number.(getFactorial)
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;
public class Library
{
    public  void isArmstrong()
    {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter a number");
         int num = in.nextInt();
         int rem = 0;
         int sum = 0;
         int dnum = num;
         while(dnum!=0)
         {
           rem = dnum%10;
           sum = sum+(rem*rem*rem);
           dnum = dnum/10;
         }
         if(sum==num)
         {
           System.out.println("the number is an armstrong number");
         }
         else
         {
           System.out.println("The number is not an armstrong number");    
         }
    }
    public void isNiven()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int rem = 0;
        int sum = 0;
        int dnum = num;
        while(dnum!=0)
        {
          rem = dnum%10;
          sum = sum+rem;
          dnum = dnum/10;
        }
        if(num%sum==0)
        {
          System.out.println("the number is a niven number");
        }
        else
        {
          System.out.println("The number is not an niven number");    
        }
    }
    public void isPerfect()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int sum = 0;
        for(int i = 1; i<num; i++)
        {
            if(num%i==0)
            sum+=i;
        }
        if(sum==num)
        System.out.println("The number is a perfect number");
        else
        System.out.println("the number is not a perfect number");
    }
    public void isNeon()
    {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int snum = num*num;
        int sum=0;
        int rem=0;
        while(snum!=0)
        {
            rem = snum%10;
            sum = sum+rem;
            snum = snum/10;
        }
        if (sum==num) {
            System.out.println("the number is a neon number");
        }
        else
        {
            System.out.println("the number is not a neon number");
        }
    }
    public void isAutomorphic()
    {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int snum=num*num;
        if (snum%10==num%10) {
            System.out.println("The number is an automorphic number");
        }
        else{
            System.out.println("the number is not an automophic number");
        }
    }
    public void getGCD()
    {
       System.out.println("enter a number");
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       System.out.println("Enter a second number");
       int num2 = in.nextInt();
       int p = num*num2;
       int ans = 0;
       int i = 0;
       for ( i = 1; i <=p; i++) {
           if(num%i==0&&num2%i==0)
           {
          ans = i;
           }        
       }
       System.out.println("the greatest common divisor of the 2 numbers is "+ans);
    }
    public void getLCM()
    {
       System.out.println("enter a number");
       Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       System.out.println("Enter a second number");
       int num2 = in.nextInt();
       int p = num*num2;
       int gcd = 0;
       int i = 0;
       for ( i = 1; i <=p; i++) {
           if(num%i==0&&num2%i==0)
           {
          gcd = i;
           }        
       }
     float lcm = p/gcd;
     System.out.println("the lcm of the two numbers is "+lcm);
    }
      public void isComposite()
    {
      System.out.println("Enter a number");
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int flag = 0;
      for (int i = 1; i <=num; i++) {
        if (num%i==0) {
           flag++;
        }
      }
      if(flag==2)
      System.out.println("The number is not a composite number");
      else
      System.out.println("the number is a composite number");
    }
    public void getSmallestDigit()
    {
      System.out.println("Enter a number");
      int x = 9;
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int rem = 0;
      while(num!=0)
      {
        rem = num%10;
        if(rem<x)
        x = rem;
        num = num/10;
      }
      System.out.println("the smallest digit in this number is "+x);
    }
    public void getFactorial()
    {
      System.out.println("Enter a number");
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int fact = 1;
      for(int i = 1; i<=num; i++)
      fact = fact*i;
      System.out.println("The factorial of the number entered by you is "+fact);
    }
    public static void main(String[] args) {
     Library x = new Library();
     x.getFactorial();    
    }
}