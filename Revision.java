package hugosql.systematic_review;

import java.io.BufferedReader;
import java.io.FileReader; 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
            "category",
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
    public String[] CabezaVariables=new String[0];
    public String[][] TablaVariables() {
        CabezaVariables=new String[] {
            "Variable Tipo",
            "Nombre",
            "Valor",
        };
        String[][] mitabla=new String[Revisiondata.VARIABLE_MAX][CabezaVariables.length];
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
    public String[] CabezaMetodologias=new String[0];
    public String[][] TablaMetodologias() {
        CabezaMetodologias=new String[] {
            "Category",
            "Methodology",
            "Sum",
        };
        String[][] mitabla=new String[0][CabezaMetodologias.length];
        if (Revisiondata.listarevisiones.size()>0) {
            Revisiondata midato=new Revisiondata();
            List<Revisiondata> milista=new ArrayList<>();
            milista=Revisiondata.listarevisiones;
            
            milista.sort(new Comparator<Revisiondata>() {
                @Override
                public int compare(Revisiondata o1, Revisiondata o2) {
                    return o1.typemethology.compareTo(o1.typemethology);
                }
            });
            List<String> resultado=new ArrayList<>();
            String acate="XXX";
            String ameto="XXX";
            Integer cantidad=0;
            Boolean primera=true;
            for (int i=0;i<milista.size();i++) {
                midato=milista.get(i);
                if (!ameto.equals(midato.typemethology)) {
                    if (primera) {
                        primera=false;
                    } else {
                        resultado.add(acate+","+ameto+","+cantidad);
                    }
                    acate=midato.category;
                    ameto=midato.typemethology.replace("|", " ");
                    cantidad=0;
                }
                cantidad++;
            } //for
            resultado.add(acate+","+ameto+","+cantidad);
            if (resultado.size()>0) {
                int r=resultado.size();
                mitabla=new String[r][CabezaMetodologias.length];
                for (int j=0;j<r;j++) mitabla[j]=resultado.get(j).split(",");
            }
        } //size>0
        return mitabla;
    }
    public String[] CabezaCategorias=new String[0];
    public String[][] TablaCategorias() {
        CabezaCategorias=new String[] {
            "Category",
            "Sum",
        };
        String[][] mitabla=new String[0][CabezaCategorias.length];
        if (Revisiondata.listarevisiones.size()>0) {
            Revisiondata midato=new Revisiondata();
            List<Revisiondata> milista=new ArrayList<>();
            milista=Revisiondata.listarevisiones;
            
            milista.sort(new Comparator<Revisiondata>() {
                @Override
                public int compare(Revisiondata o1, Revisiondata o2) {
                    return o1.category.compareTo(o1.category);
                }
            });
            List<String> resultado=new ArrayList<>();
            String acate="XXX";
            Integer cantidad=0;
            Boolean primera=true;
            for (int i=0;i<milista.size();i++) {
                midato=milista.get(i);
                if (!acate.equals(midato.category)) {
                    if (primera) {
                        primera=false;
                    } else {
                        resultado.add(acate+","+cantidad);
                    }
                    acate=midato.category.replace("|", " ");
                    cantidad=0;
                }
                cantidad++;
            } //for
            resultado.add(acate+","+cantidad);
            if (resultado.size()>0) {
                int r=resultado.size();
                mitabla=new String[r][CabezaCategorias.length];
                for (int j=0;j<r;j++) mitabla[j]=resultado.get(j).split(",");
            }
        } //size>0
        return mitabla;
    }

}
