
public class Aplicacao {

	public static void main(String[] args) throws Exception {

		// Valida alguns CPFs
		System.out.println(Validador.validarCPF("432.567.324-01"));
		System.out.println(Validador.validarCPF("43256732401"));
		System.out.println(Validador.validarCPF("432 567 324 01"));
		
		// Valida alguns telefones
		System.out.println(Validador.validarTelefone("5634-2395"));
		System.out.println(Validador.validarTelefone("5634 2395"));
		System.out.println(Validador.validarTelefone("(99) 5634-2395"));
	}
}
