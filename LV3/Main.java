import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	   int m, n, i, j;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            
            
            System.out.printf("Unesi velicinu matrice: ");
            do{
                m = in.nextInt();
            }while(m < 1|| m > 5);
           
            int first[][] = new int[m][m];
  
            System.out.println("Unesi Elemente matrice");
            for (i = 0; i < m; i++){
                for (j = 0; j < m; j++){
                    do{
                        first[i][j] = in.nextInt();
                    }while(first[i][j] < 2 || first[i][j] > 10);
                }
            }

            System.out.println("\nMatrica: ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < m; j++)
                    System.out.print(first[i][j] + "  ");
                System.out.println();
            }
            
            System.out.printf("\n");
        }
        catch (Exception e) {
            System.out.println(e);
            
        }
	
	
	
	int enter = 0;
	System.out.println("1. Zbroji sve elemete jednog arraya");
	System.out.println("2. Pronadji neparne brojeve iz jednog arraya");
	System.out.println("3. Izlaz iz programa");
	do{
	    enter = in.nextInt();
	    switch(enter){
	    
	        case 1: 
	                System.out.printf("Zbroj je ");
	                Array a = new Array();
	               
	        break;
	    
	        case 2: 
	            System.out.print("Neparni broj:\n");
	            Odd od = new Odd();
	
	        break;
	        
	        case 3:
	            System.exit(0);
	            
	        break;
	   
	    }
	}while(enter > 1 || enter < 3);
	
	
	
	
    }
}
