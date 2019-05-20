import pkg.*;
import java.util.ArrayList;


public class Hangman implements GameState {
	
	private Player player;
	private int incorrectLimit = 6;	
	private int incorrectMade = 0;
	private ArrayList<String> movesLeft;
	private String alph;
	
	private String word;
	private EasyReader console;

	private HMScreen board;
	//Constructors
    public Hangman(String name) {

		board = new HMScreen(word);

		player = new Player(name);
		movesLeft=new ArrayList<String>();
		alph="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i<alph.length(); i++) {
			movesLeft.add(alph.substring(i,i+1));		
		}

		word="alphabet";
		word=word.toUpperCase();

		console=new EasyReader();
	}
	public Hangman() {
		this("Player 1");
	}
	public boolean isGameOver() {
		return incorrectLimit==incorrectMade;
	}
	public Player getWinner() {
		return player;
	}
	public Player getCurrentPlayer() {
		return player;
	}
	public ArrayList<String> getCurrentMoves() {
		return movesLeft;
	}
	public void makeMove(String moveLetter) {
		
		String move=moveLetter.toUpperCase();
		
		int pos = movesLeft.indexOf(move);
		
		if(pos == -1) {
			incorrectMade++;
			movesLeft.remove(move);
			board.wrong(move);
		}
		else {
			board.correct(move);
		}
	}
	@Override
	public String toString() {
		return "pls implement";
	}

}
