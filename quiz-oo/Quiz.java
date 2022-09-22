import java.util.Scanner;

public class Quiz {

	public boolean pedirResposta(String resposta) {
		Scanner sc = new Scanner(System.in);
		if(sc.nextLine().equals(resposta)) {
			sc.close();
			return true;
		} else {
			sc.close();
			return false;
		}
	}
	
}
