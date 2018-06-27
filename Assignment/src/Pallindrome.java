
public class Pallindrome {

	public static void main(String[] args) {
		 int n, b, rev = 0;
			int limit=2018;
			System.out.print("Palindrome numbers from 0 to 2018:");
			for (int i = 0; i <= limit; i++)
			{
				n = i;
				while (n > 0)
				{
					b = n % 10;
					rev = rev * 10 + b;
					n = n / 10;
				}
				if (rev == i)
				{
					System.out.print(i + " ");
				}
				rev = 0;
			}
	}
	
}
