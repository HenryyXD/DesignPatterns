package mensagem;

public class MensagemSMS implements Mensagem{

    @Override
    public void enviar(String msg){
        System.out.println("SMS: " + msg);
    }
    
}
