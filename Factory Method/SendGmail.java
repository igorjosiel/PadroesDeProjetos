package factorymethod;


public class SendGmail implements SendEmail
{
    public void enviar(String conteudo)
    {
        System.out.println("Gmail: " + conteudo);
    }
}
