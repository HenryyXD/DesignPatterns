package facade;

import pc.CPU;
import pc.HD;
import pc.Memoria;
import pc.PlacaMae;
import pc.SO;

public class ComputerFacade{
    private CPU cpu;
    private HD hd;
    private Memoria memoria;
    private PlacaMae placaMae;
    private SO so;

    public ComputerFacade(){
        this.cpu = new CPU();
        this.hd = new HD();
        this.memoria = new Memoria();
        this.placaMae = new PlacaMae();
        this.so = new SO();
    }

    public void buildPC(){
        System.out.println("Construindo PC");

        placaMae.adicionarPlacaMae();
        cpu.adicionarCPU();
        memoria.adicionarMemoria();
        hd.adicionarHD();
        so.adicionarSO();

        System.out.println("Construção terminada");
    }
}