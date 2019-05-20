import pkg.EasyReader;
public class Player
{
	EasyReader console;
	private String name;
	public Player(String aName) {name=aName; console = new EasyReader();}
	public String getName() {return name;}
	public String getNextMove(GameState state) {
		return console.readChar();
	}
}