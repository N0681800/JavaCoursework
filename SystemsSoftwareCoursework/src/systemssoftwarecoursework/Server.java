package systemssoftwarecoursework;
import java.net.*;
import java.util.*;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bradley Evans
 */
public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket server = new ServerSocket(9090);
        while(true){
            System.out.println("Waiting...");
            //establish connection
            Socket client = server.accept();
            System.out.println("Connected" + client.getInetAddress());
            // create IO Streams 
            DataInputStream inFromClient = new DataInputStream(client.getInputStream());
            DataOutputStream outToClient = new DataOutputStream(client.getOutputStream());
            String clientdata = inFromClient.readUTF();
            System.out.println(clientdata); // collecting data from the client
            outToClient.writeUTF(clientdata + "Completed");
            client.close();
        }
    }
}
