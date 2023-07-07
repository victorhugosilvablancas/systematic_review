package hugosql.systematic_review;

/**
 *
 * Library for apply the Systematic_review_dataset on JFrame + JTable objects
 *
 * @author Victor Hugo Silva
 * @college Universidad Autonoma de Queretaro
 * @sponsor Conahcyt, Mexico
 */
public class Revision {
    public Revisiondata data;

    public Revision() {
        //constructor
    }
    public void getLista() {
	//retrieving dataset
    }
    public void getListaOds() {
	//retrieving dataset from ODS file
    }
    public static Integer perinicial=0;
    public static Integer perifinal=0;
    public String[] CabezaDataset=new String[0];
    public String[][] TablaDataset() {
	//normalized dataset
    }
    public String[] CabezaVariablesMethods=new String[0];
    public String[][] TablaVariablesMethods() {
        //variables
    }
    public String[] CabezaVariablesResultados=new String[0];
    public String[][] TablaVariablesResultados() {
        //variables results
    }
    public String[] CabezaCategorias=new String[0];
    public String[][] TablaCategorias() {
        //categories results
    }
    public String[] CabezaMetodologias=new String[0];
    public String[][] TablaMetodologias() {
        //methodologies results
    }
    public String[] CabezaDistribucion=new String[0];
    public String[][] TablaDistribucion() {
        //works distribution by year
    }
    
    public String[] CabezaResueltos=new String[0];
    public String[][] TablaResueltos(Boolean resueltos) {
        //solved and not solved problems
    }
    public String[] CabezaResumen=new String[] {
        "Methodology",
        "Works"
    };
    public String[][] TablaResueltosResumen(Boolean resueltos) {
        //solved and not solved problems for plotting
    }
    public String[] CabezaBrutos=new String[0];
    public Object[][] TablaBrutos() {
        //plain reference table
    }

}
