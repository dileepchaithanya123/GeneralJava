package general;

public class Example {
	
	private static String firstname;
	private String lastname;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String Firstname) {
		Example.firstname = Firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String Lastname) {
		this.lastname = Lastname;
	}

	public Example() {
		
		
	}
	
	public static void main(String[] args) {
		
		Example e = new Example();
		
		e.setFirstname("Dileep");
		e.setLastname("Ponnuru");
		
		System.out.println(e.getFirstname());
		System.out.println(e.getLastname());
	}

}
