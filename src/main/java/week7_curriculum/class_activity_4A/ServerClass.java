package week7_curriculum.class_activity_4A;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);

        System.out.println("Server waiting for client...");

        Socket clientSocket = serverSocket.accept();

        System.out.println("Client connected");

//        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//        PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
//
//        String message = input.readLine();
//        System.out.println("Client : " + message);
//
//        output.println("Hello from server");
//
//        input.close();
//        output.close();
//        clientSocket.close();
//        serverSocket.close();

        DataInputStream input = new DataInputStream(clientSocket.getInputStream());
        DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message1 = "";
        String message2 = "";

        while (!message1.equalsIgnoreCase("stop")) {
            message1 = input.readUTF();
            System.out.println("Client says : " + message1);

            message2 = br.readLine();
            output.writeUTF(message2);
        }
        input.close();
        serverSocket.close();
        clientSocket.close();
    }
}
