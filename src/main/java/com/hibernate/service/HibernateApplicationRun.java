package com.hibernate.service;

import com.hibernate.metod.forgist.HibernateMethodForCar;
import com.hibernate.inter.face.HibernateInterface;
import com.hibernate.model.Car;
import com.hibernate.model.Engine;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateApplicationRun {

    public void appRun() {

        SessionFactory factory = null;

        try {

            factory = new Configuration().configure().buildSessionFactory();

            HibernateInterface<Car, Integer> hm = new HibernateMethodForCar(factory);

            final Engine engine = new Engine();
            final Car car = new Car();


        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }
}
