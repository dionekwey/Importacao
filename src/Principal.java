import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dione Martins
 */
public class Principal {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		File arquivos[] = CarregarDiretorio.getCarregarDiretorio();
		String diretorio = CarregarDiretorio.getDiretorio();

		Arrays.sort(arquivos);

		for (File arquivo : arquivos) {
			LeituraArquivo leitura = new LeituraArquivo();
			List<String> lista = leitura.lerArquivo(diretorio + arquivo.getName());
			String nomeArquivo = leitura.getNomeArquivo();
			
			ProcessadorLinha processa = ProcessadoraInjetora.getProcessadorLinha(nomeArquivo);
			ProcessadoraArquivo processadora = new ProcessadoraArquivo(processa);
			List<Object> clientes = processadora.processaArquivo(lista);
			
			for (Object cliente : clientes) {
				System.out.println(cliente);
			}
		}
	}

}
