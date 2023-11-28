/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aljufridatamahasiswa;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerMahasiswa {
    ArrayList<mahasiswabaru> ArrayData;
    DefaultTableModel tablelist;
    
    public ControllerMahasiswa(){
        ArrayData = new ArrayList<mahasiswabaru>();
    }
    public void InsertData(String nama, String nim, int umur){
        mahasiswabaru mhs = new mahasiswabaru(nama, nim, umur);
        ArrayData.add(mhs);
    }
    public DefaultTableModel showData(){
        String[] kolom = { "Nama", "NIM", "Umur"};
        Object[][] objData = new Object[ArrayData.size()][3];
        int i = 0;
        
        for(mahasiswabaru n : ArrayData){
            String[] arrData = {n.getNama(), n.getNim(), String.valueOf(n.umur)};
            objData[i] = arrData;
            i++;
        }
        tablelist = new DefaultTableModel(objData, kolom){
        public boolean inCellEditTable(int rowIndex, int colIndex){
            return false;
        }
    };
    
    return tablelist;
    }
}
