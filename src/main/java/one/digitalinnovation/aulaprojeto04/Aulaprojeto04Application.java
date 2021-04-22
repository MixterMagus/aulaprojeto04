package one.digitalinnovation.aulaprojeto04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class Aulaprojeto04Application {

	public static void main(String[] args) {
		SpringApplication.run(Aulaprojeto04Application.class, args);
		System.out.println("Hello Word");
		var nome = "Salomão ";
		var sobrenome = "Batista";
		var nomeCompleto = nome + sobrenome;
		System.out.println("-----------------------------------");
		System.out.println(nomeCompleto);
		System.out.println("A primeira letra do seu nome é: "+nomeCompleto.charAt(0));
		System.out.println("Seu nome completo tem "+nomeCompleto.length()+" caracteres");
		System.out.println("Seu nome completo sem 'espaço' : "+nomeCompleto.trim());
		System.out.println("Seu nome em minusculo: "+nomeCompleto.toLowerCase());
		System.out.println("Seu nome em maiusculo: "+nomeCompleto.toUpperCase());
		System.out.println("Seu nome contem 'S' ? "+nomeCompleto.contains("S"));
		System.out.println("Seu nome contem 'x' ? "+nomeCompleto.contains("x"));
		System.out.println("Vamos trocar todo 'a' por '4': "+nomeCompleto.replace("a","4"));
		System.out.println("testando *Equals* com 'Salomão Batista' : "+nomeCompleto.equals("Salomão Batista"));
		System.out.println("testando *Equals* com 'qualquer outra coisa' : "+nomeCompleto.equals("teste"));
		System.out.println("testando *EqualsIgnoreCase* com 'SalOmão BaTista' : "+nomeCompleto.equalsIgnoreCase("SalOmão BaTista"));
		System.out.println("testando *EqualsIgnoreCase* com 'qualquer outra coisa' : "+nomeCompleto.equals("teexte"));
		System.out.println("'substring(1,6): "+nomeCompleto.substring(1,6));
		final var stringFormat = String.format("Teste de nome+sobrenome usando 'String.format()' %s %s:",nome,sobrenome);
		System.out.println(stringFormat);
		System.out.println(String.format("Formatando o numero 1,365874 com dias casas decimais: %.2f",1.36587));
		System.out.println("-----------------------------------");
		final var builder1 = new StringBuilder(nome);
		final var builder2 = builder1.append("Oliveira");
		System.out.println(builder2);
		System.out.println(builder2.reverse());

		System.exit(0);
	}
}