import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String x[]) throws Exception{

        String outputServer;

        Scanner input = new Scanner(System.in);
        System.out.println("digite o host para conexão");
        String host = input.next();
        Socket clientSocket = new Socket(host, 8000);


        BufferedReader inFromServer = new BufferedReader(
                new InputStreamReader(
                        clientSocket.getInputStream()
                )
        );
        outputServer = inFromServer.readLine();
        System.out.println("conectou no servidor: "+outputServer);
        clientSocket.close();
    }
}
