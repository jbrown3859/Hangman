public interface GameState
{
	boolean isGameOver();
	Player getWinner();
	ArrayList<String> getCurrentMoves();
	void makeMove(String move);
	String toString();
}