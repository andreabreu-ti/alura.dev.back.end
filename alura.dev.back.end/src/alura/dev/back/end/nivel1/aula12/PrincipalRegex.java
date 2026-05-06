package alura.dev.back.end.nivel1.aula12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrincipalRegex {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String texto = "Meu email é aanddre@gmail.com";

		Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");

		Matcher matcher = pattern.matcher(texto);

		if (matcher.find()) {

			System.err.println(matcher.group());
		}
		
		System.out.println(formatarTelefone("91971825976"));

	}

	public static String formatarTelefone(String telefone) {

		String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(telefone);

		if (matcher.matches()) {
			return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
		}

		return "Número de telefone inválido!";
	}

}
