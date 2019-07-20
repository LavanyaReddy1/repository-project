import java.util.Scanner;

class CheckHappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();

		boolean rs=isHappyNumber(n);

		if(rs)
			System.out.println(n+ " is Happy Number ");
		else
			System.out.println(n+ " is Not Happy Number ");
	}

	static boolean isHappyNumber(int n){
		int r=0,sum=0;

		while(n>9){
			sum=0;
			do{
				r=n%10;
				sum+=r*r;
				n/=10;
			}while(n!=0);
			n=sum;
		}

		System.out.println(n);

		if(n==1 || n==7)
			return true;
		else
			return false;
	}

}
