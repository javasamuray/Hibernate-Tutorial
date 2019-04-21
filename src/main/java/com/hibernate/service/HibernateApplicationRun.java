package com.hibernate.service;

import com.hibernate.inter.face.HibernateInterface;
import com.hibernate.metod.forgist.HibernateMethodForCar;
import com.hibernate.metod.forgist.HibernateMethodForEngine;
import com.hibernate.model.Car;
import com.hibernate.model.Engine;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateApplicationRun {

    public void appRun() {

        SessionFactory factory = null;

        try {

            factory = new Configuration().configure().buildSessionFactory();

            HibernateInterface<Car, Integer> hmCar = new HibernateMethodForCar(factory);
            HibernateInterface<Engine, Integer> hmEngine = new HibernateMethodForEngine(factory);



            String resCar = hmCar.read(3).toString();
            String resEngine = hmEngine.read(24).toString();

            System.out.println("Car: " + resCar);
            System.out.println("Car: " + resEngine);

            //hmCar.delete(new Car(1));
            //hmEngine.delete(new Engine(24));

        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }
}
