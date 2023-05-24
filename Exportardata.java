/*
 * HUGOSQL 2023 Victor H Silva
 * Click https://github.com/victorhugosilvablancas/systematic_review
 */
package hugosql.systematic_review;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.JTable;

/**
 *
 * @author Victor Hugo Silva Blancas
 * @college Universidad Autonoma de Queretaro, Mexico
 * @institution 2023 Conacyt, Mexico
 */
public class Exportardata {
    public static String Mensaje="";
    public Exportardata() {
        
    }
    
    public static void TablaMDPI(String atitulo,JTable atabla) {
        int r=atabla.getRowCount();
        if (r>0) {
            //columnas
            int n=atabla.getColumnCount();
            
            String cadena="\\begin{table}[H]\n"
                    + "\\caption{"+atitulo+"\\label{tab1}\\textsuperscript{1}} \n";
            if (n>4) cadena+="\\begin{adjustwidth}{-\\extralength}{0cm}\n";
            cadena+="\\newcolumntype{C}{>{\\centering\\arraybackslash}X} \n";
            if (n>4) cadena+="\\begin{tabularx}{\\fulllength}{";
            else cadena+="\\begin{tabularx}{\\textwidth}{";
            for (int j=0;j<n;j++) {
                cadena+="C";
            }
            cadena+="} \n"
                    + "\\toprule \n";
            n=atabla.getColumnCount();
            int max=n-1;
            String celda="";
            for (int j=0;j<n;j++) {
                celda=atabla.getColumnName(j);
                cadena+="\\textbf{"+celda+"}";
                if (j<max) cadena+="\t& ";
            }
            cadena+="\\\\\n";
            cadena+="\\bottomrule\n";
            for (int i=0;i<r;i++) {
                cadena+="\\mirule\n";
                for (int j=0;j<n;j++) {
                    celda=(String)atabla.getValueAt(i,j);
                    cadena+=celda;
                    if (j<max) cadena+="\t& ";
                }
                cadena+="\\\\\n";
            }
            cadena+="\\bottomrule\n"
                    + "\\end{tabularx}\n";
            if (n>4) cadena+="\\end{adjustwidth}\n";
            cadena+="\\noindent{\\footnotesize{\\textsuperscript{1} Elaboración propia.}}\n"
                    + "\\end{table}\n";
            
            StringSelection stringSelection = new StringSelection(cadena);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            
            Exportardata.Mensaje="Los datos ya están en el portapapeles.";
        }
    }
}
