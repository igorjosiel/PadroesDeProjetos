package factorymethod;


public class Factory
{
    static int contador = 0;
    
    public static SendEmail factorySendEmail()
    {
        contador ++;
        
        if (contador % 2 == 0)
        {
            return new SendGmail();
        }
        
        return new SendYahoo();
    }
}
