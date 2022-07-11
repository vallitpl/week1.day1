package week1.day1;

public class OddOrEven {
public static void main(String[] args) {
	int n = 5;
	int reminder = n % 2;
	System.out.println(n);
	if (reminder == 0)
	{
		System.out.println("Even number");
	}
	else
	{
		System.out.println("Odd number");
	}
}
}
