import java.util.*;
class TestArraySearch
{
	public static void main(String args[])throws Exception
	{
	int arr[],i,j,n,flag=0,num,choice;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Numbers Of Elements:");
	n=sc.nextInt();
	arr=new int[n];
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Array Elements are:");
	for(i=0;i<n;i++)
	{
		System.out.print(arr[i]+"\t");
	}
	do
	{
	System.out.println("\nEnter the elements to Search:");
	num=sc.nextInt();
	for(i=0;i<n-1;i++)
	{
		if(arr[i]==num)
		{
		flag=1;
		break;		
		}
	}
	if(flag==1)
	{
	System.out.println(num+" is found...");
	}
	else
	{	
	System.out.println(num+" is not found...");
	}
	System.out.println("Do you want to continue...Press-1:");
	choice=sc.nextInt();
	}while(choice==1);
	}
}