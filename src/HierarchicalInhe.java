
class One{
	void a(){
		System.out.println("One");
	}
}

class Two extends One{
	void b() {
		System.out.println("Two");
	}
}

class Three extends One{
	void c() {
		System.out.println("Three");
	}
}

public class HierarchicalInhe {

	public static void main(String[] args) {
		Two a=new Two();
		Three b=new Three();
		a.a();
		a.b();
		b.a();
		b.c();
	}

}
