package constructor;

public class MyClass {
	
	String name;
	MyClass(){
		this.name = "Dileep Chaithanya";
	}
	
	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		System.out.println(m.name);
	}

}
