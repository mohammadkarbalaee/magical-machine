package sbu.cs;

public class PinkBlock
{
    private final String OUTPUT;
    public PinkBlock(WhiteFunction whitefunction, String input1,String input2)
    {
        OUTPUT = whitefunction.function(input1,input2);
    }

    public String getOUTPUT()
    {
        return OUTPUT;
    }
}