package sbu.cs;

public class GreenBlock extends Block
{
    private String input;
    private String output;
    private final BlackFunction BLACK_FUNCTION;

    public GreenBlock(BlackFunction BLACK_FUNCTION)
    {
        this.BLACK_FUNCTION = BLACK_FUNCTION;
    }

    public void setInput(String input)
    {
        this.input = input;
    }

    public String getOutput()
    {
        output = BLACK_FUNCTION.function(input);;
        return output;
    }
}