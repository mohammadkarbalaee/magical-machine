package sbu.cs;

public class ReverseAppend implements WhiteFunction
{
    @Override
    public String function(String input1, String input2)
    {
        StringBuilder stringBuilder = new StringBuilder(input2);
        return input1 + stringBuilder.reverse();
    }
}
