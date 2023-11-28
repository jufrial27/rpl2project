/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aljufridatamahasiswa.service;

import aljufridatamahasiswa.dao.MahasiswaDAO;
import aljufridatamahasiswa.model.Mahasiswa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("MahasiswaService")
@Transactional(readOnly = true)

public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    private MahasiswaDAO mahasiswaDao;
    
    @Transactional
    @Override
    public void save(Mahasiswa mahasiswa) {
	mahasiswaDao.save(mahasiswa);
    }
    
    @Transactional
    @Override
    public void update(Mahasiswa mahasiswa) {
	mahasiswaDao.update(mahasiswa);
    }
    
    @Override
    public Mahasiswa getMahasiswa(int nim) {
	return mahasiswaDao.getMahasiswa(nim);
    }
    
    @Override
    public List<Mahasiswa> getMahasiswas() {
	return mahasiswaDao.getMahasiswas();
    }
    
}
