package general;

public class InterfaceExample {
	
public static void main(String[] args) {
	
	Drawable d = new Circle();
	d.draw();
}	

}


class Rectangle implements Drawable{
	public void draw()
	{
		System.out.println("Drawing a rectangle");
	}
}

class Circle implements Drawable{
	public void draw()
	{
		System.out.println("Drawing a circle");
	}
}

interface Drawable{
	void draw();
}