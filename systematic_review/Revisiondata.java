package hugosql.systematic_review;

/**
 *
 * Dataset configuration
 *
 * @author Victor Hugo Silva
 * @college Universidad Autonoma de Queretaro
 * @sponsor Conahcyt, Mexico
 */
public class Revisiondata {
    public Integer id;
    public String work;
    public Integer reference;
    public Integer year;
    public String methodology;
    public String typemethology;
    public String category;
    public String solved;
    public Integer quantitysolved;
    public String notsolved;
    public Integer quantitynotsolved;
    
    public Integer sumatory;
    
    public static List<Revisiondata> listarevisiones=new ArrayList<>();
    public static List<String> listacategorias=new ArrayList<>();
    public static final String RUTA="";
    public static final String HOJA="Systematic_review.ods";
    public static final String DATASET="systematic_review_dataset.csv";

    public static Integer TablaContador=0;
    
    public Revisiondata() {
        id=0;
        work="";
        reference=0;
        year=0;
        methodology="";
        typemethology="";
        category="";
        solved="";
        quantitysolved=0;
        notsolved="";
        quantitynotsolved=0;
        
        sumatory=0;
    }
    public void setValores(String linea) {
        
    }
    //cadena's prefix is for those to be columnize on JTable
    public String cadena() {
	
    }
    public String cadenaresuelto() {
        
    }
    public String cadenanoresuelto() {
        
    }
    //setters and getters
    public String categoyear() {
        
    }
    public String categotipo() {
        
    }
    public String getReference() {
        
    }
    public String getCategory() {
        
    }
    public String cadenacategoria() {
        
    }
    public String cadenareferencia() {
        
    }
    public String cadenareferenciaBib() {
        
    }
    
    
    public static String getPeriodosModa() {
        //modal
    }
    public static String getMetodologias() {
        //retrieve methodologies
    }
    public static String getResueltas() {
        //solved
    }
    public static String getIrresolutas() {
        not solved
    }
    
    //spreadsheet composition
    public static final int HOJA_DATASET     =0;
    public static final int HOJA_REFERENCIAS =1;
    public static final int HOJA_METODOLOGIAS=2;
    
}
