package general;

public class InterfaceExample2 {

	public static void main(String[] args) {
		
		Bank a = new SBI();
		Bank b = new Citi();
		Bank c = new ICICI();
		System.out.println("The rate of interest is "+a.rateOfInterest());
		System.out.println("The rate of interest is "+b.rateOfInterest());
		System.out.println("The rate of interest is "+c.rateOfInterest());

	}

}


interface Bank{
	float rateOfInterest();
}

class SBI implements Bank {
	public float rateOfInterest() {
		
		return(8.12f);
	}
}

class Citi implements Bank {
	public float rateOfInterest() {
		
		return(8.75f);
	}
}

class ICICI implements Bank{
	public float rateOfInterest() {
		
		return 8.54f;
	}
}