package sbu.cs;

public class RepeatCharacters implements BlackFunction
{
    @Override
    public String function(String input)
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++)
        {
            result.append(input.charAt(i));
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}