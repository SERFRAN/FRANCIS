/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2;

import java.net.URL;
import java.io.InputStream;
import javax.swing.text.Document;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author fb491836
 */
public class Labo2 {

    
    public static String lireURL(String url){
        String resultat = "";
          try{
            InputStream stream = new URL(url).openStream();
            resultat = IOUtils.toString(stream,"UTF-8");
          }catch(Exception e){
              System.out.println(url);
              System.out.println("Une erreur est survenu, url .. invalide");
          }
        return resultat;        
    }
    
    public static String construireURL(String auteur, String nomDeProjet){
        
        String url = "https://api.github.com/repos/";
        url += auteur + "/" + nomDeProjet + "/commits";
        
        return url;
                
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String url = "https://api.github.com/repos/alexcp/inf2015/commits";
        String url = construireURL(args[0], args[1]);
        DocumentJSON docJson = new DocumentJSON(lireURL(url));
        // System.out.println(docJson.lireLaCle(1,"commit"));
        //docJson.afficheMessage();
        //docJson.nouvelObjetJson();
        
        docJson.ecrireFichier(docJson.nouvelObjetJson());
    }
}
