import java.util.*;

class PrimeNumber {
	static boolean isPrime(int n) {
		if(n<=1)
			return false;
		if(n==2)
			return true;

		for(int i=2; i<n; i++)
			if(n%i == 0)
				return false;

		return true;
	}

	static void Prime_in_range(int low, int high) {
		int flag;

		for(int i=low; i<=high; i++) {
			if (i == 1 || i == 0)
                continue;

			flag = 1;
			for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(i + " ");
		}
	}

	public static void main(String[] args) 
	{
		// To check weather number is Prime or not
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		if(isPrime(n)) {
			System.out.println("The number is Prime");
		} else {
			System.out.println("The number is not Prime");
		}

		// Prime numbers in a given range
		int low = scan.nextInt();
		int high = scan.nextInt();

		Prime_in_range(low, high);
	}
}