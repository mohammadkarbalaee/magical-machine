package sbu.cs;

public class EvenString implements WhiteFunction
{
    @Override
    public String function(String input1, String input2)
    {
        if (isEven(input1))
        {
            return input1;
        }
        else
        {
            return input2;
        }
    }

    private boolean isEven(String input)
    {
        if (input.length() % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
