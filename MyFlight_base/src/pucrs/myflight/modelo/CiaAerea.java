package pucrs.myflight.modelo;

public class CiaAerea implements Comparable<CiaAerea>
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
	
	@Override
	public int compareTo(CiaAerea o) {
		return 0;
	}
}
