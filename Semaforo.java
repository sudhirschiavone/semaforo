public class Semaforo {
    int v=0;
    public Semaforo(int v){
        this.v=v;
    }
    synchronized public void P(){
        while(v == 0){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        v++;
    }
    synchronized public void V(){
        v++;
        notify();
    }
}
