package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorVoos 
{  
    private ArrayList <Voo> voos;

    public GerenciadorVoos () 
    {
        voos = new ArrayList<>();
    }

    public void adicionar (Voo voo) 
    {
        voos.add(voo);
    }

    //public ArrayList <Voo> listarTodos() {return voos;}

    //public ArrayList <Voo> buscarData (LocalDate data) {}
}
