/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2;

import net.sf.json.*;
import java.io.FileWriter;

/**
 *
 * @author fb491836
 */
public class DocumentJSON {

    private JSONArray json;
    
    public DocumentJSON(String contenuJSON){
        
        json = JSONArray.fromObject(contenuJSON);
    }
 
    public String lireLaCle(int position, String cle){
       return json.getJSONObject(position).getString(cle);
    }

    private JSONObject obtenirObject(int position){
        return json.getJSONObject(position);
    }
    
   /* public void afficheMessage(){
        int i=0;
        
        for (i=0;i<json.size();i++){
            System.out.println(obtenirObject(i).getJSONObject("commit").getString("message"));   
        }
    }
   */
    public String afficheMessage(int position){
        return obtenirObject(position).getJSONObject("commit").getString("message");   
    }

    public JSONObject nouvelObjetJson(){
        JSONObject objetJson = new JSONObject();
        int i=0;
        for (i=0;i<json.size();i++){
            objetJson.put(i,afficheMessage(i));
        }
        return objetJson;
    }
    
    public static void ecrireFichier(JSONObject objetJson){
        try{
           FileWriter ecrivain = new FileWriter("fichierJSON.json");
           ecrivain.write(objetJson.toString());
           ecrivain.close();
        }
        catch(Exception e){
          System.out.println("Impossible de construire le fichier !!!");   
        };
        
    }
}
