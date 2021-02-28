public class c_and_o
{
	public static void main(String args[])
	{
		Object_i_guess obj = new Object_i_guess();
		obj.set_val(100);
		System.out.println(obj.get_val());
	}
}
class Object_i_guess
{
	int n;
	void set_val(int n)
	{
		System.out.println("Value is setted");
		this.n = n;
	}
	int get_val()
	{
		System.out.println("Value has been returned");
		return this.n;
	}
}