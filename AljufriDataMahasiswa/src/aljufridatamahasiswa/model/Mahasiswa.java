/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aljufridatamahasiswa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mahasiswa")

public class Mahasiswa {
    @Id
    @Column(name = "nama", length = 50)
    private String nama;
    
    @Column(name = "nim", length = 8)
    private int nim;

    @Column(name = "umur", length = 10)
    private String umur;
    
    public String getNama() { 
        return nama; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public int getNim() { 
        return nim; 
    }
    public void setNim(int nim) { 
        this.nim = nim; 
    }

    public String getUmur() { 
        return umur; 
    }
    public void setUmur(String umur) { 
        this.umur = umur; 
    }
}
