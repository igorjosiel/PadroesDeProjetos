
public class Conta
{
    private int valor = 1;
    static Conta instance;
    
    public void increment()
    {
        this.valor ++;
    }
    
    public int getValor()
    {
        return this.valor;
    }
    
    public void setValor(int valor)
    {
        this.valor = valor;
    }
    
    static Conta getInstance()
    {
        if(Conta.instance == null)
        {
            Conta.instance = new Conta();
        }
            
        return Conta.instance;
    }
}
