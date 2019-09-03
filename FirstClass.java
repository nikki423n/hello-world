public class FirstClass
{
    private int errorCode;
    public FirstClass()
    {
        errorCode = 0;
    }
    public int askQuestion()
    {
        System.out.println("Hello, World! In First Class askQuestion()");
        return errorCode;
    }
}