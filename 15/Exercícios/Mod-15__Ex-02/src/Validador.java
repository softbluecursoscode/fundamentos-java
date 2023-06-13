import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Classe que possui métodos de validação
public class Validador {

	// Valida um CPF
	public static boolean validarCPF(String cpf) {
		String regex = "\\d\\d\\d([\\.\\s])?\\d\\d\\d([\\.\\s])?\\d\\d\\d([-\\s])?\\d\\d";
		return validarRegex(cpf, regex);
	}
	
	// Valida um telefone
	public static boolean validarTelefone(String telefone) {
		String regex = "(\\(\\d\\d\\))?\\s*\\d\\d\\d\\d([-\\s])?\\d\\d\\d\\d";
		return validarRegex(telefone, regex);
	}

	// Este método é genérico, recebe uma string e uma expressão regular para executar
	// a validação
	private static boolean validarRegex(String str, String regex) {
		// Se a string for nula, considera que a validação falhou
		if (str == null) {
			return false;
		}
		
		// Cria o objeto Pattern
		Pattern p = Pattern.compile(regex);
		
		// Cria o objeto Matcher
		Matcher m = p.matcher(str);
		
		// O método matches() verifica se o texto está no padrão especificado pela
		// expressão regular
		return m.matches();
	}
}
