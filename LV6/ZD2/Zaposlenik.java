package LV6.ZD2;

public abstract class Zaposlenik {

    int ID;
    String ime;
    String prezime;
    
    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return this.ID;
    }
    
    public void setIme(String ime){
        this.ime = ime;
    }
    
    public String getIme(){
        return this.ime;
    }
    
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    
    public String getPrezime(){
        return this.prezime;
    }
    
    public void predstaviSe(){
        System.out.println(getID());
        System.out.println(getIme());
        System.out.println(getPrezime());
    }
    
    public void radi(){
        
    }
}