import java.util.Arrays;
public class Board
{
    private int dimension;
    private char board[][];
    private int countMoves;

    Board(int dim)
    {
        this.dimension = dim;
        board = new char[dimension][dimension];
        countMoves = 0;
        for(int i = 0 ; i < dimension; i++)
        {
            Arrays.fill(board[i],'-');

        }
    }
    public void displayBoard()
    {
        for(int i = 0; i < dimension; i++)
        {
            for(int j = 0; j < dimension; j++)
            {
                System.out.print(board[i][j]  + " ");
            }
            System.out.println('\n');
        }
    }



}
