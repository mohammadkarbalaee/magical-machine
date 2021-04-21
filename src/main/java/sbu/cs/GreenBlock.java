package sbu.cs;

public class GreenBlock
{
    private final String OUTPUT;

    public GreenBlock(BlackFunction blackFunction, String input)
    {
        OUTPUT = blackFunction.function(input);
    }

    public String getOUTPUT()
    {
        return OUTPUT;
    }
}
