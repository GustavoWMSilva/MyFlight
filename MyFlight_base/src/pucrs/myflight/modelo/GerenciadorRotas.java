package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.*;

public class GerenciadorRotas 
{
    private ArrayList <Rota> rotas;

    public GerenciadorRotas () 
    {
        rotas = new ArrayList<>();
    }

    public void adicionar (Rota rota) 
    {
        rotas.add(rota);
    }

    //public ArrayList <Rota> listarTodas() {return rotas;}

    //public ArrayList <Rota> buscarPorOrigem (Aeroporto orig) 
    //{
       // ArrayList <Rota> aux = new ArrayList<>();
        //for (Rota r: rotas) 
        {
            //if (r.getOrigem().equals(?)) 
            //{
                //aux.add(r);
            //}
        }
        //return aux;
    //}

    public void ordenaNomeCia() 
    {
        Collections.sort (rotas);
    }
     
}
