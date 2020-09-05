import java.util.Scanner;

public class Main {

	private static final int kOPC_BUSCA_EXAUSTIVA = 1;
	private static final int kOPC_CONF_CEP_LOGRADOUROS = 2;
	private static final int kOPC_EXIBIR_CIDADES_LOGRADOUROS = 3;

	public static void main(String[] args) {

		Leitura leitura = new Leitura();
		Utils utils = new Utils();
		Scanner sc = new Scanner(System.in);
		int opc;

		System.out.println("Leitura de dados:\n");
		leitura.leCid();
		leitura.leLog();

		while(true) {

			mostraMenu();
			opc = sc.nextInt();

			switch(opc) {
			
				case kOPC_BUSCA_EXAUSTIVA:
					leitura.printCid();
					leitura.printLog();					
				break;

				case kOPC_CONF_CEP_LOGRADOUROS:
					utils.ConfCepLogradouros(leitura);					
				break;

				case kOPC_EXIBIR_CIDADES_LOGRADOUROS:
				
				break;

				default:
					System.out.println("\nEscolha uma opcao valida\n");
				break;
	       }			
		}
	}
	
	public static void mostraMenu(){
		System.out.println("\nOpcoes:");
		System.out.println("1- Busca Exaustiva");
		System.out.println("2- Conferencia CEP Logradouros");
		System.out.println("3- Exibir Cidades e Logradouros");
		System.out.print("Opcao escolhida: ");
	}
}
