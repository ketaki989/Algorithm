import java.util.*;
class TestArray
{
public static void main(String args[])
{
int arr[],i,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter numbers of Elements:");
n=sc.nextInt();
arr=new int[n];
System.out.println("Enter elements in Array:");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Array Elements are:");
for(i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
System.out.println("Reverse Order of Array:");
for(i=arr.length-1;i>=0;i--)
{
System.out.print(arr[i]+"\t");
}
}
}