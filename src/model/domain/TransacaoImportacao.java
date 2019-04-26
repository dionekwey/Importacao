package model.domain;

public class TransacaoImportacao implements Lote {

	private char detalhe;
	private String numeroconta;
	private String numeroplastico;
	private double valortransacao;
	private String datatransacao;
	private String horatransacao;
	private String codigoestabelecimento;
	private String numeroLote;
	private String tipolote;

	public char getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(char detalhe) {
		this.detalhe = detalhe;
	}

	public String getNumeroconta() {
		return numeroconta;
	}
	
	public void setNumeroconta(String numeroconta) {
		this.numeroconta = numeroconta;
	}

	public String getNumeroplastico() {
		return numeroplastico;
	}

	public void setNumeroplastico(String numeroplastico) {
		this.numeroplastico = numeroplastico;
	}

	public double getValortransacao() {
		return valortransacao;
	}

	public void setValortransacao(double valortransacao) {
		this.valortransacao = valortransacao;
	}

	public String getDatatransacao() {
		return datatransacao;
	}

	public void setDatatransacao(String datatransacao) {
		this.datatransacao = datatransacao;
	}

	public String getHoratransacao() {
		return horatransacao;
	}

	public void setHoratransacao(String horatransacao) {
		this.horatransacao = horatransacao;
	}

	public String getCodigoestabelecimento() {
		return codigoestabelecimento;
	}

	public void setCodigoestabelecimento(String codigoestabelecimento) {
		this.codigoestabelecimento = codigoestabelecimento;
	}

	public void setNumeroLote(String lote) {
		this.numeroLote = lote;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setTipoLote(String lt) {
		this.tipolote = lt;
	}

	@Override
	public String getTipoLote() {
		return "Transacao";
	}

	@Override
	public String toString() {
		return "Tipo Transacao [Detalhe: " + detalhe + ", NumeroDaConta: " + numeroconta + ", NumeroDoCartao: "
				+ numeroplastico + ", ValorDaTransacao: " + valortransacao + ", Horario: " + horatransacao
				+ ", CodigoDoEstabelecimento: " + codigoestabelecimento + ", Lote: " + numeroLote + "]";
	}

}
