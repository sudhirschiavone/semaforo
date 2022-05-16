public class ProduciDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti=5;
    final int attesa=500;
    public ProduciDato(Semaforo s1,Semaforo s2){
        this.pieno=s1;
        this.vuoto=s2;
    }
    synchronized public void run(){
        for(int i=0;i<tanti; i++){
            vuoto.P();
            ProdConsSem.buffer=i;
            System.out.println("Scrittore dato scritto : "+ i);
            pieno.V();
            try{
                Thread.sleep(attesa);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Scrittore: termine scrittura dati");
    }
}
