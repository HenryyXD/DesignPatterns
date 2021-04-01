import facade.ComputerFacade;

public class Principal {
    public static void main(String[] args) throws Exception {
        ComputerFacade cf = new ComputerFacade();
        cf.buildPC();
    }
}
