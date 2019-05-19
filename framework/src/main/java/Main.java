import controller.Controller;
import controller.MainController;
import entity.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(1000000);
        MainController mainController = new MainController();
        Controller currentGameController = mainController.userChooseGameToPlay();
        currentGameController.launchGame(player.getMoneyAmount());
    }
}
