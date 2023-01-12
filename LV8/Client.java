import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {

    public static void main(String[] args) {
        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            socket = new Socket("localhost", 25565);
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            Scanner scanner = new Scanner(System.in);

            while (true) {
                String poruka = scanner.nextLine();
                bufferedWriter.write(poruka);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                System.out.println("Server: " + bufferedReader.readLine());
                if (poruka.equalsIgnoreCase("Motaj kablove")) {
                    System.out.println("Server: Kablovi smotani, client ugašen");
                    break;
                }

            }

        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                if (socket != null);
                socket.close();
                if (inputStreamReader != null);
                inputStreamReader.close();
                if (outputStreamWriter != null);
                outputStreamWriter.close();
                if (bufferedReader != null);
                bufferedReader.close();
                if (bufferedWriter != null);
                bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}