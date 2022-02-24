/*************** C++ Program to fibonacci series (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89) *************/

class Fibonacci {

	static void printFibo(int num) {
		// Iterative way
		int first=0, second=1, next;

		System.out.print(first+" "+second+" ");

		for(int i=0; i<num-2; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.print(next+" ");
		}
	}


	// Getting the value of position from fibonacci series
	static int fiboAtPosition(int pos) {
		// Iterative way
		// int first=0, second=1, next = 0;
		// for(int i=0; i<pos; i++) {
		// 	next = first+second;
		// 	first = second;
		// 	second = next;
		// }
		// return next;
		// Recursive solution
		if(pos <= 1) {
			return pos;
		}
		return fiboAtPosition(pos-1) + fiboAtPosition(pos-2);
	}

	public static void main(String[] args) 
	{
		// printFibo(6);
		// System.out.println(fiboAtPosition(6));
	}
}