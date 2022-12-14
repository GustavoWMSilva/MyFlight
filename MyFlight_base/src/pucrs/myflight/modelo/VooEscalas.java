package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo
{
    private Rota rota;
    private Rota rotaFinal;
    private int totalVoos = 0;


    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora) {
        super(datahora); // chama o construtor de Voo
        this.rotaFinal = rotaFinal;
        this.rota = rota;
        totalVoos++;
    }

    public Rota getRota(){return rota;}

    public static double distanciaP(Geo geo1, Geo geo2) {
        double lat1 = Math.toRadians(geo1.getLatitude());
        double lat2 = Math.toRadians(geo2.getLatitude());
        double lon1 = Math.toRadians(geo1.getLongitude());
        double lon2 = Math.toRadians(geo2.getLongitude());
        
        double diflat = (lat1-lat2)/2;
        double diflon = (lon1-lon2)/2;
        
        double d = Math.pow(Math.sin(diflat),2)+
                   Math.pow(Math.sin(diflon),2)*
                   Math.cos(lat1) * Math.cos(lat2);
        
        d = 2 * 6371 * Math.asin(Math.sqrt(d));
                
        return d;   
    }
	public Duration getDuracao() {
        double distancia = distanciaP((rota.getOrigem()).getLocal(),(rota.getDestino()).getLocal());
        double duracaoH = (distancia/805) + 0.5;
        double duracaoM = duracaoH/60;

		return  Duration.ofMinutes((long)duracaoM);
	}

    public Rota getRotaFinal() { return rotaFinal; }
	
    public int quantObj()
	{
		return totalVoos;
	}

    @Override
    public String toString() {
       return super.toString() + " -> " + rotaFinal;
    }
}