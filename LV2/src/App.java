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

        float money;
        money = izracun(zap.pStaz, zap.pPlaca);
        System.out.printf("Do sada zaposlenik je zaradio %.1f\n", money);

        System.out.printf("Unesi starost: ");
        zap.pStarost = input.nextInt();
        System.out.printf("Unesi staž: ");
        zap.pStaz = input.nextInt();
        System.out.printf("Unesi placu: ");
        zap.pPlaca = input.nextFloat();

        System.out.printf("Godine: %d  Staz: %d  Placa: %.2f\n", zap.pStarost, zap.pStaz, zap.pPlaca);
        money = izracun(zap.pStaz, zap.pPlaca);
        System.out.printf("Do sada zaposlenik je zaradio %.1f\n", money);

        
    
        

        
        
        
    }
    
}