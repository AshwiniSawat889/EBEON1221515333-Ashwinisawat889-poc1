class insect 
{
	int i=1;
    int j;

	insect()
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
		j=1;
	}

	private static int x1=print("static insect.x1 initialized");

	private static int print(String string)
	{
		System.out.println(string);
		return 0;
	}
}
class Beetle extends insect
{
	private int k=print("Beetle.k.initialized");

	private static int x2=print("static Beetle.x2 initialized");

	private static int print(String string)
	{
		system.out.println(string);
		return 0;
	}

	public int getK()
	{
		return k;
	}
	 public void setK(int k)
	{
		 this.k=k;
	}
}
public class Testinitialization
{
	public static void main(String[] args) 
	{
		Beetle betle=new Beetle();
		System.out.println("k="+betle.getK());
		System.out.println("j="+betle.j);
	}
}
