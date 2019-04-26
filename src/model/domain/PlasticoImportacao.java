package model.domain;

public class PlasticoImportacao implements Lote {

	private char detalhe;
	private String numerodaconta;
	private String nome_inserido_plastico;
	private String cpf;
	private String numero_plastico_gerado;
	private String numeroLote;
	private String tipolote;

	public char getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(char detalhe) {
		this.detalhe = detalhe;
	}

	public String getNumerodaconta() {
		return numerodaconta;
	}

	public void setNumerodaconta(String numerodaconta) {
		this.numerodaconta = numerodaconta;
	}

	public String getNome_inserido_plastico() {
		return nome_inserido_plastico;
	}
	
	public void setNome_inserido_plastico(String nome_inserido_plastico) {
		this.nome_inserido_plastico = nome_inserido_plastico;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNumero_plastico_gerado() {
		return numero_plastico_gerado;
	}

	public void setNumero_plastico_gerado(String numero_plastico_gerado) {
		this.numero_plastico_gerado = numero_plastico_gerado;
	}

	public String getLote() {
		return numeroLote;
	}

	public void setLote(String lote) {
		this.numeroLote = lote;
	}

	public void setTipoLote(String lt) {
		this.tipolote = lt;
	}

	@Override
	public String getTipoLote() {
		return "Plastico";
	}

	@Override
	public String toString() {
		return "PlasticoImportacao [Detalhe: " + detalhe + ", NumeroConta: " + numerodaconta + ", NomePlastico: "
				+ nome_inserido_plastico + ", CPF: " + cpf + ", NumeroDoCartao: " + numero_plastico_gerado 
				+ ", Lote: " + numeroLote + "]";
	}

}
