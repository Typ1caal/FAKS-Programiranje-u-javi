import java.util.*;

public class App {

    public static void provjeri(int a){
        String mrak = "Mrak";
        String dan = "Dan";

        if(a == 0) System.out.println(mrak);
        else System.out.println(dan);
    }

    public static float izracun(int staz, float placa){

        return placa * 12 * staz;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Zarulja osram = new Zarulja();

        System.out.printf("Unesi zeljeno stanje 1 ili 0: ");
        osram.pritisniPrekidac = input.nextInt();
        provjeri(osram.pritisniPrekidac);

        Zaposlenik zap = new Zaposlenik();
       
        float iz;

        System.out.printf("Unesi starost, staz, placu: ");
        zap.pStarost= input.nextInt();
        zap.pStaz = input.nextInt();
        zap.pPlaca = input.nextFloat();

        iz = izracun(zap.pStaz, zap.pPlaca);
        System.out.printf("Starost: %d  Placa: %f  Staz: %d", zap.pStarost, zap.pPlaca, zap.pStaz);
        System.out.printf("\nUkupna placa: %.2f", iz);
        
       
    }
    
}