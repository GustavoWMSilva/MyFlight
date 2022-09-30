package pucrs.myflight.modelo;
import java.time.Duration;
import java.time.LocalDateTime;


public abstract class Voo  implements Contavel{
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

	private LocalDateTime datahora;

	public Voo(LocalDateTime dh) {
		this.datahora = dh;
	}

	public LocalDateTime getDataHora() {
		return datahora;
	}
	
	public abstract Duration getDuracao();
	
	public abstract Rota getRota();
	
	public LocalDateTime getDatahora() {
		return datahora;
	}

    @Override
    public String toString()
    {
		StringBuilder aux = new StringBuilder(); 
		aux.append(getRota());
		aux.append(getDatahora());

        return aux.toString()	;
    }
}
