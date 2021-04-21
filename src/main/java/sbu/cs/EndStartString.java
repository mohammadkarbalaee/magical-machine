package sbu.cs;

public class EndStartString implements WhiteFunction
{
    @Override
    public String function(String input1, String input2)
    {
        WoveCharacters woveCharacters = new WoveCharacters();
        StringBuilder stringBuilder = new StringBuilder(input2);
        stringBuilder.reverse();
        return woveCharacters.function(input1,stringBuilder.toString());
    }
}
