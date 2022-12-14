package pucrs.myflight.modelo;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;

import pucrs.myflight.modelo.Voo.Status;

public class Main {
    public static void main(String[] args) {
		System.out.println("\nMyFlight project...");
        
        ArrayList<CiaAerea> listaCia=  new ArrayList<>();
        ArrayList<Aeronave> listaNaves=  new ArrayList<>();
        ArrayList<Aeroporto> listaPortos=  new ArrayList<>();
        ArrayList<Rota> listaRotas=  new ArrayList<>();
        ArrayList<Voo> listaVoo=  new ArrayList<>();

        LocalDateTime datahoraV1 = LocalDateTime.of(2022, 8, 9, 8, 00);
        LocalDateTime datahoraV2 = LocalDateTime.of(2022, 12, 10, 22, 00);
        LocalDateTime datahoraV3 = LocalDateTime.of(2022, 11, 28, 12, 00);
      
        Duration duracaoV1 = Duration.ofMinutes(90); 
        Duration duracaoV2 = Duration.ofMinutes(120); 
        Duration duracaoV3 = Duration.ofMinutes(120); 
	
	
        CiaAerea c1=new CiaAerea("JJ", "LATAM Linhas Aéreas");	
		CiaAerea c2=new CiaAerea("G3", "Gol Linhas Aéreas SA");
		CiaAerea c3=new CiaAerea("TP", "TAP Portugal");
		CiaAerea c4=new CiaAerea("AS", "Azul Linhas Aéreas");

        Aeronave n1=new Aeronave("733", "Boeing 737-300", 140);	
		Aeronave n2=new Aeronave("73G", "Airbus Industrie A380", 126);
		Aeronave n3=new Aeronave("380", "TAP Portugal", 644);
		Aeronave n4=new Aeronave("764", "Boeing 767-400", 304);
		Aeronave n5=new Aeronave("332", "Boeing 743", 304);
		Aeronave n6=new Aeronave("320", "Airbus A550", 304);

        Geo g1=new Geo(-29.9939, -51.1711);//Porto Alegre
        Geo g2=new Geo(-23.4356, -46.4731);//Guarulhos
        Geo g3=new Geo(38.7742, -9.1342);//Lisboa
        Geo g4=new Geo(25.7933, -80.2906);//Miami
        Geo g5=new Geo(20.8233, -30.3906);//aleatorio
        Geo g6=new Geo(28.9999, -60.1134);//aleatorio

        Aeroporto p1=new Aeroporto("POA", "Salgado Filho Intl Apt", g1);	
		Aeroporto p2=new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", g2);
		Aeroporto p3=new Aeroporto("LIS	", "Lisbon",g3 );
		Aeroporto p4=new Aeroporto("MIA", "Miami International Apt",g4 );
		Aeroporto p5=new Aeroporto("GIG", "Aleatorio 1",g5 );
		Aeroporto p6=new Aeroporto("AEP", "Aleatorio 2",g6 );


        Rota r1=new Rota(c2, p2, p1, n2);
        Rota r2=new Rota(c2, p1, p2, n2);
        Rota r3=new Rota( c3, p4, p3, n4);
        Rota r4=new Rota( c1, p2, p5, n6);
        Rota r5=new Rota(c2, p1, p5, n2);
        Rota r6=new Rota(c2, p1, p6, n2);

        listaCia.add(c1);
        listaCia.add(c2);
        listaCia.add(c3);
        listaCia.add(c4);
      
        listaNaves.add(n1);
        listaNaves.add(n2);
        listaNaves.add(n3);
        listaNaves.add(n4);
        listaNaves.add(n5);
        listaNaves.add(n6);

        listaPortos.add(p1);
        listaPortos.add(p2);
        listaPortos.add(p3);
        listaPortos.add(p4);
        listaPortos.add(p5);
        listaPortos.add(p6);

        listaRotas.add(r1);
        listaRotas.add(r2);
        listaRotas.add(r3);
        listaRotas.add(r4);
        listaRotas.add(r5);
        listaRotas.add(r6);


        //calculando a distancia entre Porto Alegre e Guarulhos
        double d1 = Geo.distancia(g1, g2);
        System.out.printf("\nDistancia entre POA e GRU: %.2f km", d1);
	}
}
