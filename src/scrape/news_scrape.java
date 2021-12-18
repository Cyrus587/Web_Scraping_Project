/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrape;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 *
 * @author cyrus
 */
public class news_scrape {

    public String result = "";
    @Override
    public String toString(){
       
        return result;
    }
    
    public String getResult(){
        return result;
    }
    public  news_scrape(String url){
        
  
        
        
        try {
            result = Web_Scrape(url);
             
        } catch (IOException ex) {
            Logger.getLogger(news_scrape.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(result);

    
  
    }
   
       
    

    public static String Web_Scrape(String url) throws IOException {
        Document page = Jsoup.connect(url).get();
//        String link = page.html();
         Elements links = page.select("a.title");
         return links.get(0).text();
//        return link;

       /* final Elements Headline = page.select("h3.cd__headline");
        Headline.toString();
        return Headline; */
    }
}

//System.out.println(page.outerHtml());
//  ArrayList<String> blogHeadings = new ArrayList<>();
//for (Element e : pageElements) {
//blogHeadings.add("Heading: " + e.text());
//}
//for (String s : blogHeadings) {
//System.out.println(s);
// }
//}

