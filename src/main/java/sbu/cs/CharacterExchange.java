package sbu.cs;

public class CharacterExchange implements BlackFunction
{
    @Override
    public String function(String input)
    {
        int position;
        String temp;
        StringBuilder stringBuilder = new StringBuilder(input);
        for (int i = 0; i < input.length(); i++)
        {
            temp = "";
            position = input.charAt(i) - 96;
            temp += (char)(123 - position);
            stringBuilder.replace(i,i+1,temp);
        }
        return stringBuilder.toString();
    }
}