package sbu.cs;

public class BlueBlock
{
    private final String DOWN_OUTPUT;
    private final String RIGHT_OUTPUT;

    public BlueBlock(BlackFunction blackFunction, String upInput, String leftInput)
    {
        DOWN_OUTPUT = blackFunction.function(upInput);
        RIGHT_OUTPUT = blackFunction.function(leftInput);
    }

    public String getDOWN_OUTPUT()
    {
        return DOWN_OUTPUT;
    }

    public String getRIGHT_OUTPUT()
    {
        return RIGHT_OUTPUT;
    }
}