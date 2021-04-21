package sbu.cs;

public class BlueBlock extends Block
{
    private String upInput;
    private String downOutput;
    private String leftInput;
    private String rightOutput;
    private final BlackFunction BLACK_FUNCTION;

    public BlueBlock(BlackFunction BLACK_FUNCTION)
    {
        this.BLACK_FUNCTION = BLACK_FUNCTION;
    }

    public void setUpInput(String upInput)
    {
        this.upInput = upInput;
    }

    public void setLeftInput(String leftInput)
    {
        this.leftInput = leftInput;
    }

    public String getDownOutput()
    {
        downOutput = BLACK_FUNCTION.function(upInput);
        return downOutput;
    }

    public String getRightOutput()
    {
        rightOutput = BLACK_FUNCTION.function(leftInput);
        return rightOutput;
    }

}