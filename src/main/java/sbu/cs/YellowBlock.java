package sbu.cs;

public class YellowBlock
{
    private final String OUTPUT;

    public YellowBlock(BlackFunction blackFunction,String input)
    {
        OUTPUT = blackFunction.function(input);
    }

    public String getOUTPUT()
    {
        return OUTPUT;
    }
}