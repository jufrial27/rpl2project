/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aljufridatamahasiswa.dao;

import aljufridatamahasiswa.model.Mahasiswa;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MahasiswaDAOImpl implements MahasiswaDAO {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(Mahasiswa mahasiswa) {
	sessionFactory.getCurrentSession().save(mahasiswa);
    }
    
    @Override
    public void update(Mahasiswa mahasiswa) {
	sessionFactory.getCurrentSession().update(mahasiswa);
    }
    
    @Override
    public Mahasiswa getMahasiswa(int nim) {
	return (Mahasiswa) sessionFactory.getCurrentSession().get(Mahasiswa.class, nim);
    }
    
    @Override
    public List<Mahasiswa> getMahasiswas() {
	return sessionFactory.getCurrentSession().createCriteria(Mahasiswa.class).list();
    }
    
}
