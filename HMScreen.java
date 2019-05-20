import pkg.*;

public class HMScreen
{
	private int len;
	private Person person;
	private Line underscore;
	private int wrongs=0;

	public HMScreen(String word) {
		
		for(int i = 0; i < word.length(); i++) {
			underscore=new Line(100+(i*13),500, 110+(i*13),500);
			underscore.draw();
		}

		person = new Person();
		Line[] post = new Line[4];
		post[0] = new Line(100,50, 250,50);
		post[1] = new Line(250,50, 250,75);
		post[2] = new Line(100,50, 100,400);
		post[3] = new Line(60,400, 140,400);
		for(int i = 0; i < post.length; i++) {
			post[i].draw();
		}
		
		len=word.length();

	}
	public void wrong(String letter) {
		wrongs++;
		person.next();
		Text disp = new Text(100+(i*13), 515, letter);
	}
	
	public void correct(String letter) {//implement
		for(int i = 0; i < word.length(); i++) {
			if(word.substring(i,i+1)==letter) {
				Text disp = new Text(100+(i*13), 485, letter);
			}
		}
	}


}
