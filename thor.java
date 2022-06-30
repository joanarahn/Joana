import java.util.Scanner;
 
// código começa aqui
 
class Jogador {
 
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // posição X da luz do poder
        int lightY = in.nextInt(); // posição Y da luz do poder
        int initialTX = in.nextInt(); // posição inicial X do Thor
        int initialTY = in.nextInt(); // posição inicial Y do Thor
 
        int thorX = initialTX;
        int thorY = initialTY;
 
        // cria a condição
        while (true) {
            int remainingTurns = in.nextInt(); // turnos que o Thor ainda pode se mover
 
            // digita as condições
 
            String directionX="";
            String directionY="";
            if (thorX > lightX) {
                directionX="W";
                thorX = thorX - 1;
            } else if (thorX < lightX) {
                directionX = "E";
                thorX = thorX + 1;
            }
           
            if (thorY > lightY) {
                directionY = "N";
                thorY = thorY - 1;
            } else if (thorY < lightY) {
                directionY = "S";
                thorY = thorY + 1;
            }
           
            System.out.println(directionY + directionX); // essa linha fornece o movimento para ser feito
        }
    }
}

