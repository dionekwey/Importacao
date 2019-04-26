import java.text.ParseException;
import model.domain.TransacaoImportacao;

/**
 *
 * @author Dione Martins
 */

public class ProcessadoraTransacao implements ProcessadorLinha<TransacaoImportacao> {

	@Override
	public TransacaoImportacao getLinha(String linha, String cabecalho) throws ParseException {
		TransacaoImportacao transacao = new TransacaoImportacao();
		String dia = linha.substring(27, 29);
		String mes = linha.substring(29, 31);
		String ano = linha.substring(31, 35);
		String hora = linha.substring(35, 37);
		String min = linha.substring(37, 39);
		String seg = linha.substring(39, 41);
		String horario = hora + ":" + min + ":" + seg + "";
		String data = dia + "/" + mes + "/" + ano;
		double valor_transacao = Double.parseDouble(linha.substring(15, 27));

		transacao.setDetalhe(linha.charAt(0));
		transacao.setNumeroconta(linha.substring(1, 8));
		transacao.setNumeroplastico(linha.substring(8, 15));
		transacao.setValortransacao(valor_transacao / 100d);
		transacao.setDatatransacao(data);
		transacao.setHoratransacao(horario);
		transacao.setCodigoestabelecimento(linha.substring(41, 47));
		transacao.setNumeroLote(cabecalho.substring(1, 4));
		transacao.setTipoLote(transacao.getTipoLote());

		return transacao;
	}

}
