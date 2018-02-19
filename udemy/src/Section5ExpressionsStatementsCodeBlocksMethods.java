public class Section5ExpressionsStatementsCodeBlocksMethods {
    public static void main(String[] args) {
        int wynik;
        wynik = calculateHighScorePosition(1500);
        displayHighScorePosition("John", wynik);
        wynik = calculateHighScorePosition(900);
        displayHighScorePosition("Tom", wynik);
        wynik = calculateHighScorePosition(400);
        displayHighScorePosition("Maciek", wynik);
        wynik = calculateHighScorePosition(50);
        displayHighScorePosition("Jacko", wynik);

    }

    public static void displayHighScorePosition(String playerName, int positionInTheHighScoreTable) {
        System.out.println(">>" + playerName + "<< managed to get into position >>" + positionInTheHighScoreTable + "<< on the hight score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        }
        if (playerScore > 500 && playerScore < 1000) {
            return 2;
        }
        if (playerScore > 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }
}

