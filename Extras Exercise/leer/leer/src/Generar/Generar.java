/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;


import java.io.File;
import java.io.IOException;
import java.lang.System.Logger.Level;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.common.Logger;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author Angel castillo
 */
public class Generar {
    
    public  void generarE(String [][] entrada,String ruta) throws IOException, WriteException{
    
    try {
        WorkbookSettings conf =new WorkbookSettings();
        conf.setEncoding("ISO-8859-1");
        WritableWorkbook woorBook = Workbook.createWorkbook(new File(ruta),conf);
        
        WritableSheet sheet = woorBook.createSheet("resultado",0);
        
        WritableFont h =new WritableFont(WritableFont.COURIER,16,WritableFont.NO_BOLD);
        WritableCellFormat hFormat = new WritableCellFormat(h);
        
        for (int i=0;i<entrada.length;i++){
            for(int j=0;j<entrada.length;j++){
        
        sheet.addCell(new jxl.write.Label(j, i, entrada[i][j],hFormat));
            
            }
        }
        woorBook.write();
        woorBook.close();
    }catch(IOException ex){
        //Logger.getLogger(Generar.class.getName()).log(Level.,null, ex);
    }
    }
}
