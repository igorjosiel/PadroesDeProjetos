
package factorymethod;

public class FactoryMethod
{
    public static void main(String[] args)
    {
        SendEmail se;
        
        for (int i = 0; i < 5; i ++)
        {
            se = Factory.factorySendEmail();
            
            se.enviar("agora vai");
        }
    }
    
}
