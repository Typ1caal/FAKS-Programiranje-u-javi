public class Main {
    
	public static void main(String[] args){
	   
	   /*
		for(int i = 1; i <= 1; i++){
		    Raketa r = new Raketa("R" + i);
		    r.start();
		}
		*/
		
		/*
		for(int i = 1; i <= 2; i++){
		    Raketa r = new Raketa("R" + i);
		    Thread n = new Thread(r);
		    n.start();
		}
		*/
		
		
		
		Raketa r = new Raketa(" R");
		Thread n1 = new Thread(r);
		Thread n2 = new Thread(r);
		Thread n3 = new Thread(r);
		n1.start();
		n2.start();
		n3.start();
	    
		
	}
}
