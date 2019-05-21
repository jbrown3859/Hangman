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

	private boolean gameOver = false;

	private HMScreen board;
	//Constructors
    public Hangman(String name) {
		word="alphabet";
		word=word.toUpperCase();
		board = new HMScreen(word);

		player = new Player(name);
		movesLeft=new ArrayList<String>();
		alph="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0; i<alph.length(); i++) {
			movesLeft.add(alph.substring(i,i+1));		
		}
		console=new EasyReader();
	}
	public Hangman() {
		this("Player 1");
	}
	public boolean isGameOver() {
		return incorrectLimit==incorrectMade || gameOver || board.done();
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
		if(moveLetter.length()==1) {
			try {
				String move=moveLetter.toUpperCase();
		
			
				int pos = movesLeft.indexOf(move);
			
				if(pos == -1) {
					System.out.println("Already used this letter");
				}
				else if(word.indexOf(move)==-1) {
					System.out.println("Incorrect");
					incorrectMade++;
					movesLeft.remove(move);
					board.wrong(move);
				}
				else if(pos>=0 && word.indexOf(move)>=0) {
					movesLeft.remove(move);
					System.out.println("Correct");
					board.correct(move);
				}
				// System.out.println(getCurrentMoves());
			}
			catch(Exception e) {
				System.out.println("Invalid Character");
			}
		}
		else {
			if(moveLetter.toUpperCase().equals(word)) {
				gameOver=true;
			}
			else {
				incorrectMade++;
				System.out.println("Incorrect");
				board.wrong();
			}
		}
	}
	@Override
	public String toString() {
		return "pls implement";
	}

}
