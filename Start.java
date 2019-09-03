public class Start
{
    private int errorCode;
    public Start()
    {
        errorCode = 0;
    }
    public static void main(String[] args)
    {
        //BlueJ clear console command "\u000c"
        System.out.println("\u000C\nHello, World! In main");
        
        FirstClass first = new FirstClass();
        first.askQuestion();
        
        SecondClass second = new SecondClass();
        second.askQuestion();
        
        return;
    }
}
        
        
 