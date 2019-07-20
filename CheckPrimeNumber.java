class CheckPrimeNumber 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++){
			if(isPrimeNumber(i))
				System.out.println(i);
		}
	}

	static boolean isPrimeNumber(int n){
		int i=2;

		while(i<=n/2){
			if(n%i==0)
				return false;
			i++;
		}
		return true;
	}
}
