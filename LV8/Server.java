import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server {

    public static void main(String[] args) throws IOException {
       Socket socket=null;
       InputStreamReader inputStreamReader;
       OutputStreamWriter outputStreamWriter;
       BufferedReader bufferedReader;
       BufferedWriter bufferedWriter;
       ServerSocket serverSocket;
       
       String psovka1 = "jbt";
       String psovka2 = "lol";
       String psovka3 = "lmao";
       String uvreda1 = "odvratno";
       String uvreda2= "haha";
       String uvreda3 = "gey";
       
       
       serverSocket = new ServerSocket(25565);
       
       while(true){
           try{
           socket=serverSocket.accept();
           inputStreamReader= new InputStreamReader(socket.getInputStream());
           outputStreamWriter= new OutputStreamWriter(socket.getOutputStream());
           bufferedReader= new BufferedReader(inputStreamReader);
           bufferedWriter= new BufferedWriter(outputStreamWriter);
           
           while(true){
           String porukaOdKlijenta=bufferedReader.readLine();
           if(porukaOdKlijenta.contains(psovka1) || porukaOdKlijenta.contains(psovka2) || porukaOdKlijenta.contains(psovka3) || porukaOdKlijenta.contains(uvreda1) || porukaOdKlijenta.contains(uvreda2) || porukaOdKlijenta.contains(uvreda3)){
               porukaOdKlijenta=porukaOdKlijenta.replaceAll(".","*");
               bufferedWriter.write(porukaOdKlijenta+" ");
           }
               System.out.println("Client: "+ porukaOdKlijenta);
               bufferedWriter.write("Poruka primljena");
               bufferedWriter.newLine();
               bufferedWriter.flush();
               if(porukaOdKlijenta.equalsIgnoreCase("Motaj kablove")){
                   break;
               }
               
           }
           socket.close();
           inputStreamReader.close();
           outputStreamWriter.close();
           bufferedReader.close();
           bufferedWriter.close();
           } catch (IOException ex) {
               Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
}
