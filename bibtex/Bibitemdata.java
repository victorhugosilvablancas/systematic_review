package hugosql.bibtex;

/**
 *
 * Data configuration for reference list
 *
 * @author Victor Hugo Silva
 * @college Universidad Autonoma de Queretaro
 * @sponsor Conahcyt, Mexico
 */
public class Bibitemdata {
    public Integer id;
    public Integer idfinal;
    public String author;
    public Integer year;
    public String title;
    public String journal;
    public String pages;
    public String url;
    public String doi;
    
    public Integer igual;
    
    public static List<Bibitemdata> listaautores=new ArrayList<>();
    
    public Bibitemdata() {
        //constructor
    }

    //setters and getters
    public String getAuthor() {
        
    }
    public String getTitle() {
        
    }
    public String getJournal() {
        
    }
    public String getPages() {
        
    }
    public String getUrl() {
        
    }
    public String getDoi() {
        
    }
    public String getEnlace() {
        
    }
    public boolean hayDoi() {
        
    }
    public boolean hayUrl() {
        
    }
    public String ponUrl() {
        
    }
    public String cadenaindice() {
        
    }
}
