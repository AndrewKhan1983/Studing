package lesson8.BlackJack;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        Diler diler = new Diler();

        Game game = new Game();
        game.addPlaeyrToGame(player);
        game.addPlaeyrToGame(diler);

        game.addTwoCardsToPlayers();

        game.addCardsTillNeed(player);
        game.addCardsTillNeed(diler);

        game.printWinner(player, diler);



    }
}
