public class GameDriver
{
	private GameState state;
	public GameDriver(GameState initial) {state=initial;}
	public void play() 
	{
		System.out.println(state);
		while(!state.isGameOver()) {
			state.makeMove(state.getCurrentPlayer().getNextMove());
		}
		if(state.getWinner()==null)
			System.out.println("Game ends in a draw");
		else 
			System.out.println(state.getWinner()+" wins!");
	}
}