
public class LargestPalindrome {

	public static void main(String[] args) {
				int  i=0,j=0,ans=0,reverse=0,sum=0,number=0;
				System.out.println("Hello..Welcome");
				for(i = 900;i <= 999; i++)
				{
					for(j=900;j<=999;j++)
					{
						//System.out.println(i+" * "+j);
					    sum=i*j;
					    ans=sum;
						while(ans != 0)
						{
							reverse = reverse * 10;
							reverse = reverse + ans % 10;
							ans=ans/10;
						}
						if(sum == reverse)
						{
							System.out.println(i+" * "+j+" = "+reverse);	
						}
						reverse=0; 
					}
				}
		}

}
