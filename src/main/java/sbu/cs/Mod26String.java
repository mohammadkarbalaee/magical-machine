package sbu.cs;

public class Mod26String implements WhiteFunction
{
    @Override
    public String function(String input1, String input2)
    {
        StringBuilder stringBuilder = new StringBuilder();
        if (input1.length() == input2.length())
        {
            for (int i = 0; i < input1.length(); i++)
            {
                stringBuilder.append(characterMaker(input1.charAt(i),input2.charAt(i)));
            }
            return stringBuilder.toString();
        }
        else if (input1.length() > input2.length())
        {
            for (int i = 0; i < input2.length(); i++)
            {
                stringBuilder.append(characterMaker(input1.charAt(i),input2.charAt(i)));
            }
            stringBuilder.append(input1.substring(input2.length()));
            return stringBuilder.toString();
        }
        else
        {
            for (int i = 0; i < input1.length(); i++)
            {
                stringBuilder.append(characterMaker(input1.charAt(i),input2.charAt(i)));
            }
            stringBuilder.append(input2.substring(input1.length()));
            return stringBuilder.toString();
        }
    }

    private String characterMaker(char i,char j)
    {
        char c =(char)((i + j - 2*'a') % 26 + 'a');
        String result;
        result = "" + c;
        return result;
    }
}
