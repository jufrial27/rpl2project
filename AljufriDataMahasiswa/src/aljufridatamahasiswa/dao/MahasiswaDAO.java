/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aljufridatamahasiswa.dao;

import aljufridatamahasiswa.model.Mahasiswa;
import java.util.List;

public interface MahasiswaDAO {
    public void save(Mahasiswa mahasiswa);
    public void update(Mahasiswa mahasiswa);
    public Mahasiswa getMahasiswa(int nim);
    public List<Mahasiswa> getMahasiswas();
}
