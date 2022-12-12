public class Raketa extends Thread{
    String name;
    LansirnaRampa ramp;
    
    public Raketa(String name){
        this.name = name;
        ramp = new LansirnaRampa();
    }
    
    public void run(){
        System.out.println("Raketa" + name + " krece s lansiranjem");
    
    
        try{
            synchronized(this){
                ramp.launch();
            }
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        
        System.out.println("Raketa" + name + " je lansirana.");
    }
}