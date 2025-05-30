class Patners{
	void Phone() {
		System.out.println("this is an parent class");
	}
	void Phone2() {
		System.out.println("This is an parent class method");
	}
}
class Child extends Patners{
	void Black() {
		System.out.println("Thsi is an Child");
	}
	void Black2() {
		System.out.println("This is an Black2");
	}
}
class Grandchild extends Child{
	void iphone() {
		System.out.println("This is an Grand child");
	}
}
class SingleInheritence{
	public static void main(String []ar) {
		Grandchild e=new Grandchild();
		e.Phone();
		e.Phone2();
		e.Black();
		e.Black2();
		e.iphone();
	}
}
