
public class UC1
{
    public static char[] gameArray = new char[10];

    public static void ticTacToeGame()
    {
        for (int i = 0; i < gameArray.length; i++)
        {
            gameArray[i] = ' ';
        }
    }


    public static void showBoard()
    {
        System.out.println(gameArray[0] + " | " + gameArray[1] + " | " + gameArray[2]);
        System.out.println(gameArray[3] + " | " + gameArray[4] + " | " + gameArray[5]);
        System.out.println(gameArray[6] + " | " + gameArray[7] + " | " + gameArray[8]);
    }


    public static void main(String[] args) {
        System.out.println("*********** Welcome to tic tac toe game *********");
        ticTacToeGame();
        showBoard();
    }
}