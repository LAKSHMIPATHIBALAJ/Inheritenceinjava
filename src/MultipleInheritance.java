
class Grand{
	void a(){
		System.out.println("grand");
	}
}

class pare extends Grand{
	void b() {
		System.out.println("parent");
	}
}

class Child4 extends pare{
	void c() {
		System.out.println("Child");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Child4 c=new Child4();
		c.a();
		c.b();
		c.c();
	}

}
