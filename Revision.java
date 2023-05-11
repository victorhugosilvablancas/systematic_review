package hugosql.systematic_review;

import java.io.BufferedReader;
import java.io.FileReader; 
import java.util.ArrayList;

/**
 *
 * @author Victor Hugo Silva
 */
public class Revision {
    public Revisiondata data;

    public Revision() {
        data=new Revisiondata();
    }
    public void getLista() {
        Revisiondata.listarevisiones=new ArrayList<>();
        Revisiondata midato=new Revisiondata();
        try {
            FileReader fr=new FileReader(Revisiondata.DATASET);
            BufferedReader br = new BufferedReader(fr);
            //first line is the header
            String line = "";
            boolean encabezado=true;
            while ((line=br.readLine()) != null) {
                if (encabezado) {
                    encabezado=false;
                } else {
                    midato=new Revisiondata();
                    midato.setValores(line);
                    Revisiondata.listarevisiones.add(midato);
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("getLista: "+e.getLocalizedMessage());
        }
    }
    public String[] CabezaDataset=new String[0];
    public String[][] TablaDataset() {
        CabezaDataset=new String[] {
            "id",
            "work",
            "year",
            "methodology",
            "typemethology",
            "solved",
            "quantitysolved",
            "notsolved",
            "quantitynotsolved",
        };
        int r=Revisiondata.listarevisiones.size();
        String[][] mitabla=new String[r][CabezaDataset.length];
        for (int i=0;i<Revisiondata.listarevisiones.size();i++) {
            data=Revisiondata.listarevisiones.get(i);
            mitabla[i]=data.cadena().split("\t");
        }
        return mitabla;
    }
    public String[] CabezaResults=new String[0];
    public String[][] TablaResults() {
        CabezaResults=new String[] {
            "Variable Tipo",
            "Nombre",
            "Valor",
        };
        String[][] mitabla=new String[Revisiondata.VARIABLE_MAX][CabezaResults.length];
        for (int i=0;i<Revisiondata.VARIABLE_MAX;i++) {
            mitabla[i][0]=Revisiondata.variables_tipos[i];
            mitabla[i][1]=Revisiondata.variables_nombres[i];
            switch (i) {
                case Revisiondata.VARIABLE_ESTUDIOS       : 
                    mitabla[i][2]=String.valueOf(Revisiondata.listarevisiones.size());
                    break;
                case Revisiondata.VARIABLE_PERIODOMODA    : 
                    mitabla[i][2]=Revisiondata.getPeriodosModa();
                    break;
                case Revisiondata.VARIABLE_METODOLOGIAS   : 
                    mitabla[i][2]=Revisiondata.getMetodologias();
                    break;
                case Revisiondata.VARIABLE_RESUELTAS      : 
                    mitabla[i][2]=Revisiondata.getResueltas();
                    break;
                case Revisiondata.VARIABLE_IRRESOLUTAS    : 
                    mitabla[i][2]=Revisiondata.getIrresolutas();
                    break;
            }
        }
        return mitabla;
    }

}
