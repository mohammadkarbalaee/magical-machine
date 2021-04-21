package sbu.cs;

public class App
{
    private Block[][] blocks;
    private int[][] arr;
    private int n;
    private String input;

    public static void main(String[] args)
    {
        CharacterShift r = new CharacterShift();
        System.out.println(r.function("abcdefgh"));
    }
    public String main(int n, int[][] arr, String input)
    {
        blocks = new Block[n][n];
        this.arr = arr;
        this.n = n;
        this.input = input;

        initialize();

        return process();
    }

    private String process()
    {
        firstProcessor();
        middleRowsProcessor();
        return lastRowProcessor();
    }

    private String lastRowProcessor()
    {
        ((PinkBlock) blocks[n - 1][1]).setInput2(((GreenBlock) blocks[0][0]).getOutput());
        for (int i = 1; i < n - 1; i++)
        {
            ((PinkBlock)blocks[n - 1][i + 1]).setInput2(((PinkBlock)blocks[n - 1][i]).getOutput());
        }
        return ((PinkBlock)blocks[n - 1][n - 1]).getOutput();
    }

    private void middleRowsProcessor()
    {
        for (int i = 1; i < n - 1; i++)
        {
            if (i == n - 2)
            {
                ((YellowBlock) blocks[i + 1][0]).setInput(((GreenBlock) blocks[i][0]).getOutput());
            }
            else
            {
                ((GreenBlock) blocks[i + 1][0]).setInput(((GreenBlock) blocks[i][0]).getOutput());
            }
            ((BlueBlock) blocks[i][1]).setLeftInput(((GreenBlock) blocks[i][0]).getOutput());
            for (int j = 1; j < n - 1; j++)
            {
                if (i == n - 2)
                {
                    ((PinkBlock) blocks[i + 1][j]).setInput1(((BlueBlock) blocks[i][j]).getDownOutput());
                }
                else
                {
                    ((BlueBlock) blocks[i + 1][j]).setUpInput(((BlueBlock) blocks[i][j]).getDownOutput());
                }
                if (j == n - 2)
                {
                    ((PinkBlock) blocks[i][j + 1]).setInput2(((BlueBlock) blocks[i][j]).getDownOutput());
                }
                else
                {
                    ((BlueBlock) blocks[i][j + 1]).setUpInput(((BlueBlock) blocks[i][j]).getDownOutput());
                }
            }
            ((PinkBlock) blocks[i + 1][n - 1]).setInput1(((PinkBlock) blocks[i][n - 1]).getOutput());
        }
    }

    private void firstProcessor()
    {
        ((GreenBlock) blocks[0][0]).setInput(input);
        ((GreenBlock) blocks[1][0]).setInput(((GreenBlock) blocks[0][0]).getOutput());
        ((GreenBlock) blocks[0][1]).setInput(((GreenBlock) blocks[0][0]).getOutput());
        for (int i = 1; i < n - 1; i++)
        {
            ((BlueBlock) blocks[1][i]).setUpInput(((GreenBlock) blocks[0][i]).getOutput());
            if (i == n - 2)
            {
                ((YellowBlock) blocks[0][i + 1]).setInput(((GreenBlock) blocks[0][i]).getOutput());
            }
            else
            {
                ((GreenBlock) blocks[0][i + 1]).setInput(((GreenBlock) blocks[0][i]).getOutput());
            }
        }
        ((PinkBlock) blocks[1][n - 1]).setInput1(((YellowBlock) blocks[0][n - 1]).getOutput());
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