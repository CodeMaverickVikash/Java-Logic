/*************** to Check if a Given number is Palindrome *************/
// 12321 is palindrome, but 1451 is not palindrome

// class Palindrome
// {
// 	static boolean toCheckPalindrome(int num)
// 	{
// 		int temp = num;

// 		int len = String.valueOf(temp).length();

// 		int sum = 0;
// 		for(int i=0; i<len; i++)
// 		{
// 			int last = temp%10;
// 			sum = sum*10 + last;
// 			temp = temp/10;
// 		}

// 		if(sum == num)
// 			return true;
// 		else
// 			return false;
// 	}

// 	public static void main(String[] args) 
// 	{
// 		int n = 12321;

// 		System.out.println(toCheckPalindrome(n));
// 	}
// }



/**************** to Check if a Given String is Palindrome *************/

class Palindrome
{
	public static void main(String[] args) 
	{
		String str = "abcdcba";

		// Reverse the string
		// String rev = "";
		// for(int i=str.length()-1; i>=0; i--)
		// {
		// 	rev += str.charAt(i);
		// }	

		// if(str.equals(rev))
		// 	System.out.println("String is palindrome " + str);
		// else
		// 	System.out.println("String is NOT palindrome " + str);

		// Using two pointer
		int s = 0;
		int e = str.length()-1;

		while(s < e) {
			if(str.charAt(s) == str.charAt(e)) {
				s++;
				e--;
			} else {
				System.out.print("String is not palindrome");
			}
		}
		System.out.print("String is palindrome");
	}
}