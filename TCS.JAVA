//Largest in array
/*import java.util.Scanner;
class TCS
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }

        System.out.print(max);
    }
}*/

//sum of array
/*import java.util.Scanner;
class TCS
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }

    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum += arr[i];
    }
    System.out.println(sum);
}
}*/

//second largest 
/*import java.util.Scanner;
class TCS
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int largest=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }

        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>second && arr[i]!=largest)
            {
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}*/

//reverse an array
/*import java.util.Scanner;
class TCS{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int left=0;
    int right=n-1;

    while(left<right)
    {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        left++;
        right--;
    }

    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i] + " ");
    }
   }
}*/

//miaaing value
/*import java.util.*;
class TCS {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        for(int i = 0; i < n - 1; i++)
        {
            arr[i] = sc.nextInt();
        }

        int total = n * (n + 1) / 2;

        int sum = 0;

        for(int i=0;i<n-1;i++) {
            sum = sum + arr[i];
        }

        System.out.println(total - sum);
    }
}*/

//frequent count
/*import java.util.Scanner;
class TCS 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}*/

//even and odd count
import java.util.Scanner;
class TCS 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] % 2 == 0)
              even++;
            else
              odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
