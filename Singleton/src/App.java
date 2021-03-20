public class App {
    public static void main(String[] args) throws Exception {
        Usuario u1 = Usuario.getInstance();
        u1.nome = "Nome u1";
        Usuario u2 = Usuario.getInstance();
        u2.nome = "Nome u2";

        System.out.println(u1.nome);
        System.out.println(u2.nome);
        System.out.println(u1);
        System.out.println(u2);
    }
}


class Usuario{
    private static Usuario instance; 
    public String nome; 

    private Usuario(){
    
    }

    public static Usuario getInstance(){
        if(instance == null){
            instance = new Usuario();
        }
        return instance;
    }

}