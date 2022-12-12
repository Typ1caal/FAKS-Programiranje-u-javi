public class LansirnaRampa{
    public synchronized void launch() throws InterruptedException{
        try{
            for(int i = 10; i >= 0; i--){
                Thread.sleep(500);
                System.out.println(i);
            }
        } catch(InterruptedException e){
            throw new RuntimeException (e);
        }
    }

}