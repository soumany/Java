package OOP;
class Game {
    private String gameState;

    public void start() {


        
    }

    public void pause() {
       
    }

    public void stop() {
    }

}
class SinglePlayerGame extends Game {
    public void playAgainstComputer() {

        
    }
}

class MultiplayerGame extends Game {
    public void playAgainstOtherPlayers() {





    }
}

class GameLauncher {
    private Game gameObject;

    public GameLauncher(Game gameObject) {
        this.gameObject = gameObject;
    }

    public void launchGame() {
        gameObject.start();
        gameObject.pause();
        gameObject.stop();
    }
}

public class Ex8 {
    
        public static void main(String[] args) {
        GameLauncher gameLauncher = new GameLauncher(new SinglePlayerGame());
        gameLauncher.launchGame();
        System.out.println("---------------------------");
        gameLauncher = new GameLauncher(new MultiplayerGame());
        gameLauncher.launchGame();



        }
    
    
}
