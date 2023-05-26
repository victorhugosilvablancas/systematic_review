package hugosql.systematic_review;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor Hugo Silva
 */
public class Revisiondata {
    public Integer id;
    public String work;
    public Integer year;
    public String methodology;
    public String typemethology;
    public String category;
    public String solved;
    public Integer quantitysolved;
    public String notsolved;
    public Integer quantitynotsolved;
    
    public static List<Revisiondata> listarevisiones=new ArrayList<>();
    public static final String DATASET="systematic_review_dataset.csv";

    public Revisiondata() {
        id=0;
        work="";
        year=0;
        methodology="";
        typemethology="";
        category="";
        solved="";
        quantitysolved=0;
        notsolved="";
        quantitynotsolved=0;
    }
    public void setValores(String linea) {
        String[] partes=linea.split(",");
        id=Integer.valueOf(partes[0]);
        work=partes[1];
        year=Integer.valueOf(partes[2]);
        methodology=partes[3];
        typemethology=partes[4];
        category=partes[5];
        solved=partes[6];
        quantitysolved=Integer.valueOf(partes[7]);
        notsolved=partes[8];
        quantitynotsolved=Integer.valueOf(partes[9]);
    }
    public String cadena() {
        return id+"\t"
                + work+"\t"
                + year+"\t"
                + methodology+"\t"
                + typemethology+"\t"
                + category+"\t"
                + solved+"\t"
                + quantitysolved+"\t"
                + notsolved+"\t"
                + quantitynotsolved
                ;
    }
    
    public static final int VARIABLE_ESTUDIOS       =0;
    public static final int VARIABLE_PERIODOMODA    =1;
    public static final int VARIABLE_METODOLOGIAS   =2;
    public static final int VARIABLE_RESUELTAS      =3;
    public static final int VARIABLE_IRRESOLUTAS    =4;
    public static final int VARIABLE_MAX            =5;
    public static String[] variables_tipos=new String[] {
        "Independiente",
        "Independiente",
        "Independiente",
        "Dependiente",
        "Dependiente",
    };
    public static String[] variables_nombres=new String[] {
        "Estudios Realizados",
        "Moda de Períodos",
        "Metodologías Aplicadas",
        "Problemas Resueltos",
        "Problemas Irresolutos",
    };

    /**
    retrieve periods mode
    **/
    public static String getPeriodosModa() {
        //code
    }
    
    /**
    reetrive methodologies
    **/
    public static String getMetodologias() {
        //code
    }
    
    /**
    retrieve methodologies solved
    **/
    public static String getResueltas() {
        //code
    }
    
    /**
    retrieve methodologies not solved
    **/
    public static String getIrresolutas() {
        //code
    }
}
