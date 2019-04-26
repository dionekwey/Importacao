/**
 *
 * @author Dione Martins
 */

class ProcessadoraInjetora {
    
    public static ProcessadorLinha getProcessadorLinha(String nomeArquivo) throws Exception {
        return (ProcessadorLinha) Class.forName(nomeArquivo).newInstance();
    }
    
}
