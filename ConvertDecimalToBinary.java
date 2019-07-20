import java.util.Scanner;

class ConvertDecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number: ");
		int dec=sc.nextInt();

		String bin=convertDecToBin(dec);

		System.out.println("Binary equivalent of "+ dec + " is "  + bin);
	}
	
	static String convertDecToBin(int dec){
		int r=0;String bin="";

		while(dec!=0){
			r=dec%2;
			bin=r+bin;
			dec/=2;
		}

		return bin;
	}
}
