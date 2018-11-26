/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageComplexity;

import java.awt.image.BufferedImage;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Stores information pertaining to wikipedia info boxes.
 * 
 * @author noah
 */
public class InfoBox {
    
    private String header;
    private Element elem;
    private Elements children;
    private String imgUrl;
    private BufferedImage img;
    protected boolean isImg;
    
    //////
    //Constructors
    //////
    
    public InfoBox(Element elemClone){
        this.elem = elemClone;
        this.init();
    }
    
    //////
    //Methods
    //////
    
    //print text from every table row
    public void printRaw(){
        System.out.println();
        for(Element e : this.children){
            System.out.println(e.text() + "\n");
        }
    }
    
    //grab the table elements and the image
    public void init(){
        this.children = this.elem.select("tr");
        this.imgUrl = this.elem.getElementsByTag("a").first().attr("abs:href");
        if(this.imgUrl == null) this.isImg = false;
        else{
            this.isImg = true;
            //TO DO: download image and store as BufferedImage
        }
        
    }
    
}
