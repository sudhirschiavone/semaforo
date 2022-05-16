public class ConsumaDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int dato;
    public ConsumaDato(Semaforo s1, Semaforo s2){
        this.pieno=s1;
        this.vuoto=s2;
    }
    synchronized public void run(){
        while(true){
            pieno.P();
            dato=ProdConsSem.buffer;
            System.out.println("Lettore: dato letto"+ dato);
            vuoto.V();
        }
    }


}