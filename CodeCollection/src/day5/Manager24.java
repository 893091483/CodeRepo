package day5;

class a28{
	public a28() {
		System.out.println("dc-a");
	} 
	{
		System.out.println("ac-a");
	}
}

class b28 extends a28{
	public b28() {
		System.out.println("dc-b");
	} 
	{
		System.out.println("ac-b");
	}
}
public class Manager24 {
	public static void main(String[] args) {
		a28 a = new a28();
		System.out.println();
		b28 b = new b28();
	}
}
