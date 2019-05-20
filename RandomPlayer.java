public class RandomPlayer extends Player
{
	public RandomPlayer(String aName) 
	{
		super(aName);
	}
	@Override
	public String getNextMove(GameState state) 
	{
		if(state.getCurrentMoves().size()==0)
			return "no move";
		else
			return state.getCurrentMoves().get((int)(Math.random()*state.getCurrentMoves().size()));
	}
}