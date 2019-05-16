import Entity.Game;
import Service.GameInitialization;
import Service.GameProceeding;

public class Main {
    public static void main(String[] args) {
        GameInitialization gameInitialization = new GameInitialization();
        Game currentGame = gameInitialization.gameInit();
        GameProceeding gameProceeding = new GameProceeding();
        gameProceeding.gameStart(currentGame);
    }
}
