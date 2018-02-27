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
public class Handler implements Runnable{
    Socket client;
    DataOutputStream outToClient;
    DataInputStream inFromClient;
    
    public Handler(Socket _client) throws IOException{
        client =_client;
        outToClient = new DataOutputStream(client.getOutputStream());
    } //constructor
    
    public void run(){
        try{
            //return data
            outToClient.writeUTF("Completed through threading");
    } catch (IOException e){}
    }// end of run
} // end of the class
