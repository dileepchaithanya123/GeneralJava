package getterAndSetters;

import java.util.Date;

public class SimpleGetterAndSetter {
	
	//First Variable
	private int number;
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int num) {
		this.number = num;
	}
	
	//Second Variable
	public String firstName;
	
	public void setFirstName(String fname)
	{
		this.firstName = fname;
	}
	
	public String getFirstName() {
		
		return this.firstName;
	}
	
	//Third Variable
	private int[] scores;
	
	public void setScores(int[] scr) {
		this.scores = scr;
	}

	//Fourth Variable (Date)
	private Date birthDate;
	
	public void setBirthDate(Date date)
	{
		this.birthDate = (Date) date.clone();
	}
	
	public Date getBirthDate() 
	{
		return this.birthDate;
	}



	
}
