import java.util.Scanner;

class ConvertOctalToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Octal Number: ");
		int oct=sc.nextInt();

		int dec=convertOctToDec(oct);

		System.out.println("Decimal representation of "+ oct + " is "+dec);
	}

	static int convertOctToDec(int oct){
		int r=0,dec=0,c=0;

		while(oct!=0){
			r=oct%10;
			dec+=r*pow(8,c++);
			oct/=10;
		}

		return dec;
	}

	static int pow(int n,int p){
		int pw=1;
		while(p>0){
			pw*=n;
			p--;
		}
		return pw;
	}
}
