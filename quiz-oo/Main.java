import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Joana Rahn Vicenzi 
		
		Scanner sc = new Scanner(System.in);
		
		Quiz quiz = new Quiz();
		
		System.out.println("Digite seu nome");
		String nome = sc.nextLine(); // o código está pedindo o nome
		System.out. println("Olá, "+nome);
		System.out.println("Digite sua idade"); 
		String idade = sc.nextLine(); // o código está pedindo a idade
		
		System.out.println("Olá jogador! Você tem "+ idade + " anos");
		System.out.println("Lembre-se que continente se escreve com letra maiúscula");
		System.out.println("Continente dos países"); 

		int questoesCertas = 0;
		
		int continuar = 1;
		
		while(continuar == 1) {
			System.out.println("Aperte enter para confirmar");
			sc.nextLine(); // o código está esperando confirmação do usuário
			System.out.println("Em qual continente fica a Alemanha? ");
		
			if(quiz.pedirResposta("Europa")) { // o código está comparando o que o usuário escreveu com a resposta
				System.out.println("Certo");
				questoesCertas = questoesCertas + 1; // o código está somando a pontuação
			} else {
				System.out.println("Errado! A resposta é Europa");
			}
	
			System.out.println("Em qual continente fica a Albânia? ");
		
			if(quiz.pedirResposta("Europa")) { // o código está comparando o que o usuário escreveu com a resposta
				System.out.println("Certo");
				questoesCertas = questoesCertas + 1; // o código está somando a pontuação
			} else {
				System.out.println("Errado! A resposta é Europa");
			}
		
			System.out.println("Em qual continente fica o Cabo Verde? ");
		
			if(quiz.pedirResposta("África")) { // o código está comparando o que o usuário escreveu com a resposta
				System.out.println("Certo");
				questoesCertas = questoesCertas + 1; // o código está somando a pontuação
			} else {
				System.out.println("Errado! A resposta é África");
			}	
		
			System.out.println("Em qual continente fica o Catar? ");
		
			if(quiz.pedirResposta("Ásia")) { // o código está comparando o que o usuário escreveu com a resposta
					System.out.println("Certo");
				questoesCertas = questoesCertas + 1; // o código está somando a pontuação
			} else {
				System.out.println("Errado! A resposta é Ásia");
			}
		
			System.out.println("Em qual continente fica o Chipre? ");
		
			if(quiz.pedirResposta("Ásia")) { // o código está comparando o que o usuário escreveu com a resposta
				System.out.println("Certo");
				questoesCertas = questoesCertas + 1; // o código está somando a pontuação
			} else {
				System.out.println("Errado! A resposta é Ásia");
			}
		
			System.out.println("Em qual continente fica o Filipinas? ");
		
			if(quiz.pedirResposta("Ásia")) { // o código está comparando o que o usuário escreveu com a resposta
				System.out.println("Certo");
				questoesCertas = questoesCertas + 1; // o código está somando a pontuação
			} else {
				System.out.println("Errado! A resposta é Ásia");
			}
		
			System.out.println("Em qual continente fica o Jamaica? ");
		
			if(quiz.pedirResposta("América do norte")) { // o código está comparando o que o usuário escreveu com a resposta
				System.out.println("Certo");
				questoesCertas = questoesCertas + 1; // o código está somando a pontuação
			} else {
				System.out.println("Errado! A resposta é América do norte");
			}
		
			System.out.println("Em qual continente fica o Nova Zelândia? ");
		
			if(quiz.pedirResposta("Oceania")) { // o código está comparando o que o usuário escreveu com a resposta
				System.out.println("Certo");
				questoesCertas = questoesCertas + 1; // o código está somando a pontuação
			} else {
				System.out.println("Errado! A resposta é Oceania");
			}
		
			System.out.println("Em qual continente fica o Paquistão? ");
		
			if(quiz.pedirResposta("Ásia")) { // o código está comparando o que o usuário escreveu com a resposta
				System.out.println("Certo");
				questoesCertas = questoesCertas + 1; // o código está somando a pontuação
			} else {
				System.out.println("Errado! A resposta é Ásia");
			}
		
			System.out.println("Em qual continente fica o Noruega? ");
		
			if(quiz.pedirResposta("Europa")) { // o código está comparando o que o usuário escreveu com a resposta
				System.out.println("Certo");
				questoesCertas = questoesCertas + 1; // o código está somando a pontuação
			} else {
				System.out.println("Errado! A resposta é Europa");
			}
		
			System.out.println("Pontuação: "+questoesCertas);
			questoesCertas = 0; // o códido está zerando a pontuação
			System.out.println("Quer jogar novamente? [0 - Não // 1 - Sim]"); // o código está perguntando se o usuário quer jogar novamente
			continuar = sc.nextInt();
		}
		
		System.out.println("Obrigado por jogar"); // o código está agradecendo o usuário por ter jogado
		sc.close();
	}
}
