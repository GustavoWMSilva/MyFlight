package pucrs.myflight.modelo;
import java.util.*;

public class CiaAerea implements Comparable
{
	private String codigo;
	private String nome;
	
	public CiaAerea(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int compareTo (CiaAerea outra) 
	{
		return 0;
	}
}
