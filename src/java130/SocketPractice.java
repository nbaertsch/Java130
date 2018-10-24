/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java130;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Learning about Sockets and general networking stuff on my own time.
 * Only a testing environment.
 * 
 * @author noah.baertsch
 */
public class SocketPractice {
    
    //technology rediscovery = 104.236.104.185
    
    static final int httpPort = 80;
    
    public static void main(String[] args){
        Socket sock = new Socket();
        InetSocketAddress server = null;
        try {
            server = new InetSocketAddress(InetAddress.getByName("technologyrediscovery.net"), 80);
            sock.connect(server);
        } catch (UnknownHostException ex) {
            System.out.println(ex.getLocalizedMessage());
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        System.out.println(server.getAddress().toString());
        
        System.out.println("Socket is connected: " + sock.isConnected());
    }
}
