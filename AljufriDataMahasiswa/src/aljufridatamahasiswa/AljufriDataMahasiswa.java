package aljufridatamahasiswa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import aljufridatamahasiswa.service.MahasiswaService;


public class AljufriDataMahasiswa {

    private static ApplicationContext applicationContext;
    
    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new aljufriViewMahasiswa().setVisible(true);
    }

    public static MahasiswaService getMahasiswaService(){
        return(MahasiswaService)applicationContext.getBean("MahasiswaService");
    }
}
