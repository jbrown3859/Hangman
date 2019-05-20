import pkg.*;

public class HMScreen
{
	private int len;
	private Person person;

	public HMScreen(String word) {
		
		person = new Person();
		Line[] post = new Line[4];
		post[0] = new Line(new Point(100,50), new Point(250,50));
		post[1] = new Line(new Point(250,50), new Point(250,75));
		post[2] = new Line(new Point(100,50), new Point(100,400));
		post[3] = new Line(new Point(60,400), new Point(140,400));
		for(int i = 0; i<post.length; i++) {
			post[i].draw();
		}
		
		len=word.length();

	}
	public void wrong() {person.next();}
	public void correct() {//implement
	
	}


}
