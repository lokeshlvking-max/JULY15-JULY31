public class Main
{
    public static void main(String[]args)
    {
        int result;
        result=20;
        int assign=process(result);
        result=assign;
        
        System.out.print(result);
    }
    static int process(int a)
    {
        return a+5;
    }}
    
