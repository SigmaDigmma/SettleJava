package com.settle;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serversocket = new ServerSocket(5555);
		Socket socket = serversocket.accept();
		System.out.println("Server : Client Connected");
		DataInputStream sIn = new DataInputStream(socket.getInputStream());
		System.out.println("Server : " + sIn.readUTF());
		
		DataOutputStream sOut = new DataOutputStream(socket.getOutputStream());
		sOut.writeUTF("Server Answer");

		serversocket.close();
	}

}
