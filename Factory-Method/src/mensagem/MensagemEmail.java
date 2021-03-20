package mensagem;

public class MensagemEmail implements Mensagem{

    @Override
    public void enviar(String msg) {
        System.out.println("Email: " + msg);        
    }
    
}
