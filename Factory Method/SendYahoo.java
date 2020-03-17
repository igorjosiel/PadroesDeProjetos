package factorymethod;


public class SendYahoo implements SendEmail
{
    public void enviar(String conteudo)
    {
        System.out.println("Yahoo: " + conteudo);
    }
}
