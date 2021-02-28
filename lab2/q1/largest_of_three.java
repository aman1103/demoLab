public class largest_of_three
{
	public static void main(String args[])
	{
		int a=10,b=30,c=20,largest;
		largest = a>b?(a>c?a:c):b>c?b:c;
		System.out.println(largest);
	}
}