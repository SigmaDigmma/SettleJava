package com.settle;
import java.io.*;
import java.net.Socket;
public class Client {

	
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost",5555);
		DataOutputStream cOut = new DataOutputStream(socket.getOutputStream());
		cOut.writeUTF("Message from Client");
		
		DataInputStream cIn = new DataInputStream(socket.getInputStream());
		System.out.println("Client : " + cIn.readUTF());

		socket.close();
	}

}
