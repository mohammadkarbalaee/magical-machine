package sbu.cs;

public class App
{
    private Block[][] blocks;
    private int[][] arr;
    private int n;

    public String main(int n, int[][] arr, String input)
    {
        blocks = new Block[n][n];
        this.arr = arr;
        this.n = n;
        initialize();
        return null;
    }

    private BlackFunction blackFunctionMaker(int functionNumber)
    {
        switch (functionNumber)
        {
            case 1: return new ReverseString();
            case 2: return new RepeatCharacters();
            case 3: return new RepeatString();
            case 4: return new CharacterShift();
            case 5: return new CharacterExchange();
            default: return null;
        }
    }

    private WhiteFunction whiteFunctionMaker(int functionNumber)
    {
        switch (functionNumber)
        {
            case 1: return new WoveCharacters();
            case 2: return new ReverseAppend();
            case 3: return new EndStartString();
            case 4: return new EvenString();
            case 5: return new Mod26String();
            default: return null;
        }
    }

    private void initialize()
    {
       firstRowInitializer();
       middleRowsInitializer();
       lastRowInitializer();
    }

    private void firstRowInitializer()
    {
        for (int i = 0; i < n - 1; i++)
        {
            blocks[0][i] = new GreenBlock(blackFunctionMaker(arr[0][i]));
        }
        blocks[0][n - 1] = new YellowBlock(blackFunctionMaker(arr[0][n - 1]));
    }

    private void middleRowsInitializer()
    {
        for (int i = 1; i < n - 1; i++)
        {
            blocks[i][0] = new GreenBlock(blackFunctionMaker(arr[i][0]));
            for (int j = 1; j < n - 1; j++)
            {
                blocks[i][j] = new BlueBlock(blackFunctionMaker(arr[i][j]));
            }
            blocks[i][n - 1] = new PinkBlock(whiteFunctionMaker(arr[i][n - 1]));
        }
    }

    private void lastRowInitializer()
    {
        blocks[n - 1][0] = new YellowBlock(blackFunctionMaker(arr[n - 1][0]));
        for (int i = 1; i < n; i++)
        {
            blocks[n - 1][i] = new PinkBlock(whiteFunctionMaker(arr[n - 1][i]));
        }
    }
}