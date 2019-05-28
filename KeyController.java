import java.awt.event.*;

public class KeyController{

    private Canvas c = null;
    private InputKeyControl iC;

    public KeyController(Canvas c, InputKeyControl iC){
        this.c = c;
        this.iC = iC;
        // System.out.println("Key Started");
        handleKey();
    }

    private void handleKey()
	{
        this.c.frame.addKeyListener(new KeyListener() {
            @Override
			public void keyPressed(KeyEvent e) {
				char cc = e.getKeyChar();
				String c = Character.toString(cc);
                iC.keyPress(c);
            }

			
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
            
    });
}
/*
public class starter implements InputControl, InputKeyControl 
{
		
        public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
			
			// please leave following line alone, necessary for keyboard input
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			// put code here
			
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			
			
	
		}
		
		public void keyPress(String s)
		{
			
	
		}

}
*/