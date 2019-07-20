import java.util.Scanner;

class CheckPerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();

		boolean rs=isPerfectNumber(n);

		if(rs)
			System.out.println(n+ " is Perfect Number");
		else
			System.out.println(n+ " is not a Perfect Number");
	}

	static boolean isPerfectNumber(int n){
		int sum=0,i=1;

		while(i<=n/2){
			if(n%i==0)
				sum+=i;
			i++;
		}
		return sum==n;
	}
}
