import java.util.Random;
public class jogo {
    public static void main(String[] args) throws Exception{
       personagem cacador = new personagem(10, 0, 0);
       personagem soneca = new personagem (2,4,10);
       personagem guloso = new personagem (4,10,2);
      
       Random gerador = new Random();
       soneca.setnome("Soneca");
       guloso.setnome("Guloso");
       cacador.setnome("Mestre");
      
       //1: cacar
       //2: comer
       //3: dormir

       while(true){
            int oQueFazer = gerador.nextInt(3) + 1;
            switch(oQueFazer){
                case 1:
                    soneca.cacar();
                    guloso.dormir();
                    System.out.println("\n");
                    break;
                case 2:
                    soneca.comer();
                    guloso.cacar();
                    System.out.println("\n");
                    break;
                case 3:
                    soneca.dormir();
                    guloso.comer();
                    System.out.println("\n");
                    break;
            }
            System.out.println("-----------------------------"); 
            Thread.sleep(2000);
       }
    }
}