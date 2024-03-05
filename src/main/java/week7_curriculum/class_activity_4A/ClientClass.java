package week7_curriculum.class_activity_4A;

import java.io.*;
import java.net.Socket;

public class ClientClass {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);

//        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
//        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//        output.println("Hello from client");
//
//        String response = input.readLine();
//        System.out.println("Server : " + response);
//
//        input.close();
//        output.close();
//        socket.close();

        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message1 = "";
        String message2 = "";

        while (!message1.equalsIgnoreCase("stop")) {
            message1 = br.readLine();
            output.writeUTF(message1);
            message2 = input.readUTF();
            System.out.println("Server says : " + message2);
        }
        input.close();
        output.close();
    }
}
