public class personagem{

    private String nome;
    private int energia = 10;
    private int fome = 0;
    private int sono = 0;
  
    
    final static int LIMITE_SUPERIOR = 10;
    
    public personagem(int energia, int fome, int sono){
        if (energia >=0 && energia <=10)
            this.energia = energia;
        if (fome >= 0 && fome <=10)
            this.fome = fome;
        if (sono >= 0 && sono <=10)
            this.sono = sono;  
    }
    
    public personagem(String nome, int energia, int fome, int sono){this(energia,fome,sono);//Essa sintaxe só pode ser usada dentro de um Construtor
        this.nome = nome;
    }    

    public void setnome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    void estado(){
        System.out.printf("\nEstado: \nPersonagem: %s  \nEnergia: %s  \nFome: %s  \nSono: %s",
        this.nome, this.energia, this.fome, this.sono);
    }    
        
    void cacar(){
        if (this.energia >= 2){
            System.out.println(nome + " caçando...");
            this.energia = this.energia - 2;
            estado();
        }
        else{
            System.out.println(nome + " sem energia para caçar...");
            estado();
        }
        this.fome = Math.min (this.fome + 1, LIMITE_SUPERIOR);
        this.sono = Math.min(this.sono + 1, LIMITE_SUPERIOR);
    }
    
    void comer(){
        if (this.fome >= 1){
            System.out.println(this.nome + " comendo...");
            this.fome -= 1;
            this.energia = this.energia + 1 <= 10 ? this.energia + 1 : this.energia;
            estado();
        }
        else{
            System.out.printf("%s sem fome...\n", nome);
            estado();
        }
    }

    void dormir(){
        if (this.sono >= 1){
            System.out.println(String.format("%s dormindo...", this.nome));
            this.sono -=1;
            this.energia = this.energia + 1 <= LIMITE_SUPERIOR? this.energia + 1 : this.energia;
            estado();
        }
        else{
            System.out.println(this.nome + " sem sono...");
            estado();
        }

    
    
    }
}