//1 ) Number of prime in a specified range 
import java.util.Scanner
  class prime
  {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int start=0;
    int end=0;
    int count=0;
    for(int num=start;num<=end;num++)
  {
    factor=0;
    for(int i=1;i<=num;i++)
      {
        if(num % i == 0)
        {
          factor++;
        }
      }
    if(factor==2)
    {
      count++;
    }
  }
System.out.println(count);
}
  }

//2.palindrome or not 
import java.util.Scanner;
class palindrome
{
    public static void main(String[] args)
    {
        int n=155551;
        int temp=n;
        int rev=0;

        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
       if(temp==rev)
       System.out.println("palindrome:"+rev);
       else
       System.out.println("not palindrome");
    }
}
    
