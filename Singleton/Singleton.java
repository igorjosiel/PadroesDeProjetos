


public class Singleton
{

    public static void main(String[] args)
    {
        Conta c1 = Conta.getInstance();
        Conta c2 = Conta.getInstance();
        Conta c3 = Conta.getInstance();
        
        c1.increment();
        c1.increment();
        
        System.out.println("" + c1.getValor());
    }
    
}
