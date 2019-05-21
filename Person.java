import pkg.*;

public class Person
{
	private Shape[] person;
	private int moves=0;

	public Person() {
		person=new Shape[6];
		
		person[0]=new Ellipse(225,75, 50, 50);
		person[1]=new Line(250,125, 250,200);
		person[2]=new Line(250,200, 225,225);
		person[3]=new Line(250,200, 275,225);
		person[4]=new Line(250,160, 225,150);
		person[5]=new Line(250,160, 275,150);
	}
	public void next() {
		person[moves].draw();
		moves++;
	}

}