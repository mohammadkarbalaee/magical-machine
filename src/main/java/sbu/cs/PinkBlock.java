package sbu.cs;

public class PinkBlock extends Block
{
    private String input1;
    private String input2;
    private String output;
    private final WhiteFunction WHITE_FUNCTION;

    public PinkBlock(WhiteFunction WHITE_FUNCTION)
    {
        this.WHITE_FUNCTION = WHITE_FUNCTION;
    }

    public void setInput1(String input1)
    {
        this.input1 = input1;
    }

    public void setInput2(String input2)
    {
        this.input2 = input2;
    }

    public String getOutput()
    {
        output = WHITE_FUNCTION.function(input1,input2);
        return output;
    }
}