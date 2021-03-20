package mensagem;

public class MensagemFactory {

    public static Mensagem getMensagem(TipoMensagem tm){
        if(tm == TipoMensagem.SMS){
            return new MensagemSMS();
        }else if(tm == TipoMensagem.EMAIL){
            return new MensagemEmail();
        }else{
            return new MensagemSMS();
        }
    }

}
