package sbu.cs;

public class ReverseString implements BlackFunction
{
    @Override
    public String function(String input)
    {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }
}