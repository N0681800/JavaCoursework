/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemssoftwarecoursework;
import java.net.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author Bradley Evans
 */
public class MutliThreadedServer {
    public static void main(String[] args) throws IOException{
        ServerSocket server = new ServerSocket(9090);
        while(true){
            System.out.println("Waiting...");
            //establish connection
            Socket client = server.accept();
            System.out.println("Connected" + client.getInetAddress());
            // assign the client to the handler
            Handler h = new Handler(client);
            Thread t = new Thread(h);
            t.start();
        }
    }
}
