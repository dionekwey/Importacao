import java.text.ParseException;
import model.domain.PlasticoImportacao;

/**
 *
 * @author Dione Martins
 */

public class ProcessadoraPlastico implements ProcessadorLinha<PlasticoImportacao> {

    @Override
    public PlasticoImportacao getLinha(String linha,String cabecalho) throws ParseException {
        PlasticoImportacao plastico= new PlasticoImportacao();
        
        plastico.setCpf(linha.substring(38, 49));
        plastico.setDetalhe(linha.charAt(0));
        plastico.setNumerodaconta(linha.substring(1, 8));
        plastico.setNome_inserido_plastico(linha.substring(8, 38));
        plastico.setNumero_plastico_gerado(linha.substring(49,56));
        plastico.setLote(cabecalho.substring(1,4));
        plastico.setTipoLote(plastico.getTipoLote());
        
        return plastico;
    }
   
}
