import model.domain.ContaImportacao;
import java.text.ParseException;

public class ProcessadoraConta implements ProcessadorLinha<ContaImportacao> {
	
	@Override
	public ContaImportacao getLinha(String linha, String cabecalho) throws ParseException {
		ContaImportacao conta = new ContaImportacao();
		String dia = linha.substring(25,27);
		
		conta.setTipo(linha.charAt(1));
		conta.setCpf(linha.substring(2,13));						
		conta.setValorLimite(new Double(linha.substring(13,25)) / 100d);
		
		if (!dia.equals("__")) {
			conta.setDiaVencimentoFatura(new Integer(dia));	
		} else {
			conta.setDiaVencimentoFatura(null);
		}
		
		conta.setNumeroConta(linha.substring(27,33));
        conta.setLote(cabecalho.substring(1,4));
        conta.setTipoLote(conta.getTipoLote());
        
		return conta;
	}
}
