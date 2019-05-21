public class play {
	public static void main(String[] args) {
		Hangman game = new Hangman("Joey");
		GameDriver driver=new GameDriver(game);
		driver.play();
	}
}
