/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aljufridatamahasiswa;

public class mahasiswabaru {
    private final String nama;
    private final String nim;
    final int umur;
    
    public mahasiswabaru(String nama, String nim, int umur){
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public int getUmur(){
        return umur;
    }
    
    @Override
    public String toString(){
        return "Nama: "+ nama +", NIM: "+ nim +", Umur: "+ umur;
    }
}
