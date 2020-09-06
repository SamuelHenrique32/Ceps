import java.util.Objects;

public class Utils {

	public void ConfCepLogradouros(Leitura leitura){
		
		int quantCorretos = 0;
		int quantErrados = 0;
		
		for(DadosL objL : leitura.objLog) {

			for(DadosC objC : leitura.objCid) {
				if(objL.chave.equals(objC.chave) && objL.UF.equals(objC.UF)) {

					System.out.println("Cep: " + objL.CEP + " Chave cidade: " + objL.chave + " Nome Cidade: " + objC.cidade);
					System.out.println("Minimo valor de CEP possivel: " + objC.cepmin + " Maximo valor de CEP possivel: " + objC.cepmax);

					try {
						if((Integer.parseInt(objL.CEP) >= Integer.parseInt(objC.cepmin)) && ((Integer.parseInt(objL.CEP) <= Integer.parseInt(objC.cepmax)))){
							System.out.println("Valor do CEP está correto");
							quantCorretos++;
						}
						else {
							System.out.println("Valor do CEP está errado");
							quantErrados++;
						}

						System.out.println("\n");

					} catch (Exception e) {
						// Nothing to do
					}					
				}
			}
		}
		
		System.out.println("======================= " + "Estatísticas" + " =======================");
		System.out.println("Quantidade de registros corretos: " + quantCorretos);
		System.out.println("Quantidade de registros errados: " + quantErrados);
	}

	public void exibirNomeCidadeLogradouros(Leitura leitura) {
		
		int quantRegistros = 0;
		
		for(DadosC objC : leitura.objCid) {

			// Skip first register
			if(objC.cidade.equals("CIDADE")){
				continue;
			}

			quantRegistros = 0;
			System.out.println("======================= Logradouros da Cidade: " + objC.cidade + " =======================");

			for(DadosL objL : leitura.objLog) {
				if(objC.chave.equals(objL.chave) && (objC.UF.equals(objL.UF))){
					System.out.println(objL.nome + ", CEP: " + objL.CEP);
					quantRegistros++;
				}			
			}
			
			System.out.println("\nRegistros encontrados: " + quantRegistros + "\n");
		}
	}
}