package sbu.cs;

public class CharacterShift implements BlackFunction
{
    @Override
    public String function(String input)
    {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.insert(0,input.charAt(input.length()-1));
        stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());
        return stringBuilder.toString();
    }
}