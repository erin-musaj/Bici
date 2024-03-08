import java.util.Random;

public class Bici implements Runnable{

    private int metriPercorsi;
    private int count;
    private int velocita;
    private String nome;

    public Bici(String nome, int velocita){
        this.nome = nome;
        this.velocita = velocita;
        this.metriPercorsi = 0;
        this.count = 0;
    }

    @Override
    public void run() {
        Random r = new Random();
        while(metriPercorsi<300){
            count++;
            if(this.count%10==0){
                this.velocita += r.nextInt(21) - 10;
                this.velocita = this.velocita>0? 10:this.velocita;
            }
            metriPercorsi+=velocita;
            System.out.println(this.nome + " ha fatto " + this.velocita + " metri e gli mancano " + (300 - this.metriPercorsi) + " metri");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        System.out.println(this.nome + " è arrivato: " + Main.pos);
        Main.pos++;
    }
}
