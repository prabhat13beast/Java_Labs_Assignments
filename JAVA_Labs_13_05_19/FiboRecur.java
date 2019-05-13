class FiboRecur{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the limit:");
		int n = sc.nextInt();
		FiboRecur fb = new FiboRecur();
		System.out.println("Nth term: "+ fb.fibo(n));
		
		System.out.println("Using Recursion:");
		System.out.println(fb.fiboRec(n));


	}
	int fibo(int n)
	{
		int a=0; int b=1; int c=0;
		for (int i=1;i<n; i++ ) 
		{
				
				c=a+b;
				a=b;
				b=c;
		}
		return c;
	}
	int fiboRec(int n)
	{
		if (n==1 || n==2) 
		{
			return 1;
		}
		else {
			return fiboRec(n-1)+fiboRec(n-2);
	         }
	     }
	 }