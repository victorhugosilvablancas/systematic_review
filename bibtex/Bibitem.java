package hugosql.bibtex;


/**
 *
 * Library for reference data exportation to LaTex
 *
 * @author Victor Hugo Silva
 * @college Universidad Autonoma de Queretaro
 * @sponsor Conahcyt, Mexico
 */
public class Bibitem {
    public Bibitemdata data;
    
    public Bibitem() {
        data=new Bibitemdata();
    }
    
    public void getListaOds() {
        //retrieve list of works
    }
    
    public String[] Cabeza=new String[0];
    public Object[][] Tabla() {
        //table of works
    }
    
    public static List<Bibitemdata> listatitulos=Bibitemdata.listaautores;
    public String[][] TablaIndice() {
        //works by index
    }
    public void ExportaBibTex() {
        //create reference list for LaTeX
    }

}
