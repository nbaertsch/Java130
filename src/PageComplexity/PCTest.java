/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageComplexity;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

/**
 *
 * @author noah
 */
public class PCTest {
    
    //vars
    private static String url, search;
    private static Document doc;
    private static Scanner scan;
    
    //main
    public static void main(String[] args){
        
        //init scanner
        scan = new Scanner(System.in);
        
        //query user for url
        //System.out.print("address: ");
        //url = scan.next();
        
        //set hardcode url
        url = "https://en.wikipedia.org/wiki/";
        
        try {
            //user query
            System.out.print("Search Wikipedia: ");
            search = scan.nextLine();
            System.out.println("Sending " + search + " to formatter.");
            search = formatQuery(search);
            System.out.println("Searching Wikipedia for " + search + "...");
            
            //acquire DOM via jsoup magic
            System.out.println("connecting to server...");
            doc = Jsoup.connect(url + search).get();
            System.out.println("connection established");
            
            //print title
            System.out.println();
            System.out.println("Title: " + doc.title());
            
            //create tag elements
            Element head = doc.head();
            Element body = doc.body();
            
            //create list of body elements
            Elements bodyElems = body.children();
            
            //print the head
            //System.out.println("Head: " + head.text());
            
            //print the body
            //System.out.println("Body: " + body.text());
            
            //grab info box element
            InfoBox infoBox = new InfoBox(body.getElementsByClass("infobox").first().clone());
            
            //print it
            //infoBox.printRaw();
            
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        
        
        
        //fin
        scan.close();
        System.exit(0);
    }
    
    /**
     * Formats the string into Wikipedia-acceptable request
     */
    private static String formatQuery(String str){
        char[] chars = str.toLowerCase().toCharArray();
        //System.println("TEST: " + );
        boolean found = false;
        for(int i=0; i<chars.length; i++){
            if(!found && Character.isLetter(chars[i])){
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if(Character.isWhitespace(chars[i]) /*|| chars[i]=='_'*/){
                chars[i] = '_';
                found = false;
            }
        }
        
        return new String(chars);
    }
    
}