/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java130;

import java.net.*;
import java.io.*;


/**
 * Learning about Sockets and general networking stuff on my own time.
 * Only a testing environment.
 * 
 * @author noah.baertsch
 */
public class SocketPractice {
    
    //technology rediscovery = 104.236.104.185
    
    static final int HTTP = 80;
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Socket sock = new Socket();
        InetSocketAddress server = null;
        try {
            server = new InetSocketAddress(InetAddress.getByName("technologyrediscovery.net"), HTTP);
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
