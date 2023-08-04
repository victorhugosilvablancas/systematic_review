package hugosql.systematic_review;

import hugosql.bibtex.Apariciones;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader; 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import org.jopendocument.dom.spreadsheet.MutableCell;
import org.jopendocument.dom.spreadsheet.SpreadSheet;

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
            FileReader fr=new FileReader(Revisiondata.RUTA+Revisiondata.DATASET);
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
    public void getListaOds() {
        Revisiondata.listarevisiones=new ArrayList<>();
        Revisiondata midato=new Revisiondata();
        try {
            File f=new File(Revisiondata.RUTA+Revisiondata.HOJA);
         
            SpreadSheet hojadedatos = SpreadSheet.createFromFile(f);

            int cols = hojadedatos.getSheet(Revisiondata.HOJA_DATASET).getColumnCount();
            int rens = hojadedatos.getSheet(Revisiondata.HOJA_DATASET).getRowCount();

            //notar que para jopendocument es (col,ren) y para jtable es (ren,col)
            MutableCell celda = null;
            String cade="";
            //i=1 para evitar el encabezado
            for(int i = 1; i < rens; i++) {
                midato=new Revisiondata();
                for(int j = 0; j < cols; j++) {
                    celda = hojadedatos.getSheet(Revisiondata.HOJA_DATASET).getCellAt(j, i);
                    if (celda!=null)
                        cade=String.valueOf(celda.getValue());
                    else cade="";
                    switch (j) {
                        case 0: midato.id=Integer.valueOf(cade); break;
                        case 1: midato.work=cade; break;
                        case 2: midato.reference=Integer.valueOf(cade); break; //Apariciones.getFinal(Integer.valueOf(cade)); break;
                        case 3: midato.year=Integer.valueOf(cade); break;
                        case 4: midato.methodology=cade; break;
                        case 5: midato.typemethology=cade; break;
                        case 6: midato.category=cade; break;
                        case 7: midato.solved=cade; break;
                        case 8: 
                            if (cade!=null) {
                                if (cade.length()>0) 
                                    midato.quantitysolved=Integer.valueOf(cade); 
                            }
                            break;
                        case 9: midato.notsolved=cade; break;
                        case 10: 
                            if (cade!=null) {
                                if (cade.length()>0)
                                    midato.quantitynotsolved=Integer.valueOf(cade);
                            }
                            break;
                    }
                }
                Revisiondata.listarevisiones.add(midato);
            }
            Revisiondata.listacategorias=new ArrayList<>();
            Revisiondata.listarevisiones.sort(new Comparator<Revisiondata>() {
                @Override
                public int compare(Revisiondata o1, Revisiondata o2) {
                    return o1.categoyear().compareTo(o2.categoyear());
                }
            });
            String xcatego="XXX";
            for (int i=0;i<Revisiondata.listarevisiones.size();i++) {
                if (!xcatego.equals(Revisiondata.listarevisiones.get(i).category)) {
                    xcatego=Revisiondata.listarevisiones.get(i).category;
                    Revisiondata.listacategorias.add(Revisiondata.listarevisiones.get(i).category);
                }
            }
        } catch (Exception e) {
            System.out.println("getListaOds: "+e.getLocalizedMessage());
        }
    }
    public static Integer perinicial=0;
    public static Integer perifinal=0;
    public String[] CabezaDataset=new String[0];
    public String[][] TablaDataset() {
        CabezaDataset=new String[] {
            "category/reference",
            "year",
            "typemethology",
            "quantitysolved",
            "quantitynotsolved",
        };
        String[][] mitabla=new String[0][CabezaDataset.length];
        List<Revisiondata> milista=Revisiondata.listarevisiones;
        milista.sort(new Comparator<Revisiondata>() {
            @Override
            public int compare(Revisiondata o1, Revisiondata o2) {
                return o1.categoyear().compareTo(o2.categoyear());
            }
        });
        Revision.perinicial=9999;
        Revision.perifinal=0;
        List<String> listacorta=new ArrayList<>();
        int r=milista.size();
        String xcatego="XXX";
        for (int i=0;i<milista.size();i++) {
            data=milista.get(i);
            if (!xcatego.equals(data.category)) {
                listacorta.add(data.cadenacategoria());
                xcatego=data.category;
            }
            listacorta.add(data.cadenareferencia());
            
            //sólo referencias a partir de 2000
            if (data.year>1999) {
                if (Revision.perinicial>data.year) Revision.perinicial=data.year;
                if (Revision.perifinal<data.year) Revision.perifinal=data.year;
            }
        }
        if (listacorta.size()>0) {
            r=listacorta.size();
            mitabla=new String[r][CabezaDataset.length];
            for (int i=0;i<r;i++) 
                mitabla[i]=listacorta.get(i).split("\t");
        }
        return mitabla;
    }
    public String[] CabezaVariablesMethods=new String[0];
    public String[][] TablaVariablesMethods() {
        CabezaVariablesMethods=new String[] {
            "Variable independiente",
            "Influye en",
            "Variable dependiente",
            "Indicador de desempeño",
        };
        String[][] mitabla=new String[Revisiondata.VARIABLE_METHODS][CabezaVariablesMethods.length];
        for (int i=0;i<Revisiondata.VARIABLE_METHODS;i++) {
            mitabla[i][0]=Revisiondata.methods_independents[i];
            mitabla[i][1]=Revisiondata.methods_intervention[i];
            mitabla[i][2]=Revisiondata.methods_dependents[i];
            mitabla[i][3]=Revisiondata.methods_performance_indicator[i];
        }
        return mitabla;
    }
    public String[] CabezaVariablesResultados=new String[0];
    public String[][] TablaVariablesResultados() {
        CabezaVariablesResultados=new String[] {
            "Variable Tipo",
            "Nombre",
            "Valor",
            "Unidad",
        };
        String[][] mitabla=new String[Revisiondata.VARIABLE_MAX][CabezaVariablesResultados.length];
        for (int i=0;i<Revisiondata.VARIABLE_MAX;i++) {
            mitabla[i][0]=Revisiondata.variables_tipos[i];
            mitabla[i][1]=Revisiondata.variables_nombres[i];
            switch (i) {
                case Revisiondata.VARIABLE_ESTUDIOS       : 
                    mitabla[i][2]=String.valueOf(Revisiondata.listarevisiones.size());
                    mitabla[i][3]="Works";
                    break;
                case Revisiondata.VARIABLE_PERIODOMODA    : 
                    mitabla[i][2]=Revisiondata.getPeriodosModa();
                    mitabla[i][3]="Modal";
                    break;
                case Revisiondata.VARIABLE_METODOLOGIAS   : 
                    mitabla[i][2]=Revisiondata.getMetodologias();
                    mitabla[i][3]="Predominant";
                    break;
                case Revisiondata.VARIABLE_RESUELTAS      : 
                    mitabla[i][2]=Revisiondata.getResueltas();
                    mitabla[i][3]="Works";
                    break;
                case Revisiondata.VARIABLE_IRRESOLUTAS    : 
                    mitabla[i][2]=Revisiondata.getIrresolutas();
                    mitabla[i][3]="Works";
                    break;
            }
        }
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
                    return o1.category.compareTo(o2.category);
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
                    acate=midato.category;
                    cantidad=0;
                }
                cantidad++;
            } //for
            resultado.add(acate+","+cantidad);
            if (resultado.size()>0) {
                int r=resultado.size();
                mitabla=new String[r][CabezaCategorias.length];
                for (int i=0;i<r;i++) mitabla[i]=resultado.get(i).split(",");
            }
        } //size>0
        return mitabla;
    }
    public String[] CabezaMetodologias=new String[0];
    public String[][] TablaMetodologias() {
        CabezaMetodologias=new String[] {
            "Category",
            "Type",
            "Works",
        };
        String[][] mitabla=new String[0][CabezaMetodologias.length];
        if (Revisiondata.listarevisiones.size()>0) {
            Revisiondata midato=new Revisiondata();
            List<Revisiondata> milista=new ArrayList<>();
            milista=Revisiondata.listarevisiones;
            
            milista.sort(new Comparator<Revisiondata>() {
                @Override
                public int compare(Revisiondata o1, Revisiondata o2) {
                    return o1.categotipo().compareTo(o2.categotipo());
                }
            });
            
            List<Revisiondata> listaaux=new ArrayList<>();
            String ameto="XXX";
            Integer cantidad=0;
            Boolean primera=true;
            Revisiondata aux=new Revisiondata();
            for (int i=0;i<milista.size();i++) {
                midato=milista.get(i);
                if (!ameto.equals(midato.categotipo())) {
                    if (primera) {
                        primera=false;
                    } else {
                        aux.sumatory=cantidad;
                        listaaux.add(aux);
                    }
                    aux=midato;
                    ameto=midato.categotipo();
                    cantidad=0;
                }
                cantidad++;
            } //for
            aux.sumatory=cantidad;
            listaaux.add(aux);
            if (listaaux.size()>0) {
                int r=listaaux.size();
                mitabla=new String[r][CabezaMetodologias.length];
                String acatego="XXX";
                for (int i=0;i<r;i++) {
                    if (!acatego.equals(listaaux.get(i).category)) {
                        mitabla[i][0]=listaaux.get(i).category;
                        acatego=listaaux.get(i).category;
                    }
                    mitabla[i][1]=listaaux.get(i).typemethology;
                    mitabla[i][2]=String.valueOf(listaaux.get(i).sumatory);
                }
            }
        } //size>0
        return mitabla;
    }
    public String[] CabezaDistribucion=new String[0];
    public String[][] TablaDistribucion() {
        CabezaDistribucion=new String[] {
            "Year",
            "Works",
        };
        String[][] mitabla=new String[0][CabezaDistribucion.length];
        if (Revisiondata.listarevisiones.size()>0) {
            Revisiondata midato=new Revisiondata();
            List<Revisiondata> milista=new ArrayList<>();
            milista=Revisiondata.listarevisiones;
            
            milista.sort(new Comparator<Revisiondata>() {
                @Override
                public int compare(Revisiondata o1, Revisiondata o2) {
                    return o1.year.compareTo(o2.year);
                }
            });
            
            List<Revisiondata> listaaux=new ArrayList<>();
            Integer xyear=-1;
            Integer cantidad=0;
            Boolean primera=true;
            Revisiondata aux=new Revisiondata();
            for (int i=0;i<milista.size();i++) {
                midato=milista.get(i);
                if (!xyear.equals(midato.year)) {
                    if (primera) {
                        primera=false;
                    } else {
                        aux.sumatory=cantidad;
                        listaaux.add(aux);
                    }
                    aux=midato;
                    xyear=midato.year;
                    cantidad=0;
                }
                cantidad++;
            } //for
            aux.sumatory=cantidad;
            listaaux.add(aux);
            if (listaaux.size()>0) {
                int r=listaaux.size();
                mitabla=new String[r][CabezaDistribucion.length];
                for (int i=0;i<r;i++) {
                    mitabla[i][0]=String.valueOf(listaaux.get(i).year);
                    mitabla[i][1]=String.valueOf(listaaux.get(i).sumatory);
                }
            }
        } //size>0
        return mitabla;
    }
    
    public String[] CabezaResueltos=new String[0];
    public String[][] TablaResueltos(Boolean resueltos) {
        CabezaResueltos=new String[] {
            "id",
            "work",
            "reference",
            "year",
            "methodology",
            "typemethology",
            "category",
            "problem",
            "quantity",
        };
        String[][] mitabla=new String[0][CabezaResueltos.length];
        if (Revisiondata.listarevisiones.size()>0) {
            List<Revisiondata> milista=new ArrayList<>();
            Revisiondata midato=new Revisiondata();
            boolean pasa=false;
            for (int i=0;i<Revisiondata.listarevisiones.size();i++) {
                midato=Revisiondata.listarevisiones.get(i);
                if (resueltos) pasa=midato.quantitysolved>0;
                else pasa=midato.quantitynotsolved>0;
                if (pasa) milista.add(midato);
            }
            if (milista.size()>0) {
                milista.sort(new Comparator<Revisiondata>() {
                    @Override
                    public int compare(Revisiondata o1, Revisiondata o2) {
                        return o1.category.compareTo(o2.category);
                    }
                });
                int r=milista.size();
                mitabla=new String[r][CabezaResueltos.length];
                for (int i=0;i<r;i++) {
                    midato=milista.get(i);
                    if (resueltos)
                        mitabla[i]=midato.cadenaresuelto().split("\t");
                    else
                        mitabla[i]=midato.cadenanoresuelto().split("\t");
                }
                
            }
        } //size>0
        return mitabla;
    }
    public String[] CabezaResumen=new String[] {
        "Methodology",
        "Works"
    };
    public String[][] TablaResueltosResumen(Boolean resueltos) {
        String[][] mitabla=new String[0][CabezaResumen.length];
        if (Revisiondata.listarevisiones.size()>0) {
            List<Revisiondata> milista=new ArrayList<>();
            Revisiondata midato=new Revisiondata();
            boolean pasa=false;
            for (int i=0;i<Revisiondata.listarevisiones.size();i++) {
                midato=Revisiondata.listarevisiones.get(i);
                if (resueltos) pasa=midato.quantitysolved>0;
                else pasa=midato.quantitynotsolved>0;
                if (pasa) milista.add(midato);
            }
            if (milista.size()>0) {
                Vector<String> cho=new Vector<>();
                milista.sort(new Comparator<Revisiondata>() {
                    @Override
                    public int compare(Revisiondata o1, Revisiondata o2) {
                        return o1.category.compareTo(o2.category);
                    }
                });
                String xcatego="XXX";
                Integer suma=0;
                Boolean primera=true;
                for (int i=0;i<milista.size();i++) {
                    midato=milista.get(i);
                    if (!xcatego.equals(midato.category)) {
                        if (primera) primera=false;
                        else {
                            cho.add(xcatego+"\t"+suma);
                        }
                        xcatego=midato.category;
                        suma=0;
                    }
                    if (resueltos)
                        suma+=midato.quantitysolved;
                    else
                        suma+=midato.quantitynotsolved;
                }
                if (suma>0) {
                    cho.add(xcatego+"\t"+suma);
                }
                
                if (cho.size()>0) {
                    int r=cho.size();
                    mitabla=new String[r][CabezaResumen.length];
                    for (int j=0;j<r;j++) {
                        mitabla[j]=cho.get(j).split("\t");
                    }
                    
                }
            }
        } //size>0
        return mitabla;
    }
    public String[] CabezaBrutos=new String[0];
    public Object[][] TablaBrutos() {
        CabezaBrutos=new String[] {
            "id",
            "work",
            "reference",
            "year",
            "methodology",
            "typemethology",
            "category",
            "solved",
            "quantitysolved",
            "notsolved",
            "quantitynotsolved",
        };
        Object[][] mitabla=new Object[0][CabezaBrutos.length];
        if (Revisiondata.listarevisiones.size()>0) {
            List<Revisiondata> milista=Revisiondata.listarevisiones;
            milista.sort(new Comparator<Revisiondata>() {
                @Override
                public int compare(Revisiondata o1, Revisiondata o2) {
                    return o1.work.compareTo(o2.work);
                }
            });
            Revisiondata midato=new Revisiondata();
            int r=milista.size();
            mitabla=new Object[r][CabezaBrutos.length];
            for (int i=0;i<r;i++) {
                midato=milista.get(i);
                mitabla[i][0]=midato.id;
                mitabla[i][1]=midato.work;
                mitabla[i][2]=midato.reference;
                mitabla[i][3]=midato.year;
                mitabla[i][4]=midato.methodology;
                mitabla[i][5]=midato.typemethology;
                mitabla[i][6]=midato.category;
                mitabla[i][7]=midato.solved;
                mitabla[i][8]=midato.quantitysolved;
                mitabla[i][9]=midato.notsolved;
                mitabla[i][10]=midato.quantitynotsolved;
            }
        } //size>0
        return mitabla;
    }

}
