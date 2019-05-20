import pkg.*;

public class Person
{
	private Shape[] person;
	private int moves=0;

	public Person() {
		person=new Shape[6];
		
		person[0]=new Ellipse(new Point(225,75), 50, 50);
		person[1]=new Line(new Point(250,125), new Point(250,200));
		person[2]=new Line(new Point(250,200), new Point(225,225));
		person[3]=new Line(new Point(250,200), new Point(275,225));
		person[4]=new Line(new Point(250,160), new Point(225,150));
		person[5]=new Line(new Point(250,160), new Point(275,150));
	}
	public void next() {
		moves++;
		person[moves].draw();
	}

}