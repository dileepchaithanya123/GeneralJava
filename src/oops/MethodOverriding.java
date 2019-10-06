package oops;

import getterAndSetters.SimpleGetterAndSetter;

public class MethodOverriding {
	
	public static void main(String[] args) {
		
		Class1 t = new Class1();
		
		Class1 s = new Class2();
		
		t.Sample();
		
		s.Sample();
		
		SimpleGetterAndSetter x = new SimpleGetterAndSetter();
		x.setNumber(20);
		System.out.println(x.getNumber());
		
		
	}
}

