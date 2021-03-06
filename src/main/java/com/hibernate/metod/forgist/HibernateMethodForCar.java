package com.hibernate.metod.forgist;

import com.hibernate.inter.face.HibernateInterface;
import com.hibernate.model.Car;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jetbrains.annotations.NotNull;


public class HibernateMethodForCar implements HibernateInterface<Car, Integer> {

    /*
     Connection factory to database.
    */
    private final SessionFactory factory;

    public HibernateMethodForCar(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(@NotNull final Car car) {

        try (final Session session = factory.openSession()) {

            session.beginTransaction();

            session.save(car);

            session.getTransaction().commit();
        }
    }

    @Override
    public Car read(@NotNull final int id) {

        Car result;
        try (final Session session = factory.openSession()) {

            result = session.get(Car.class, id);

            if (result != null) {
                Hibernate.initialize(result.getCar(result));
            }

        }
        return result;
    }

    @Override
    public void update(@NotNull final Car car) {

        try (Session session = factory.openSession()) {

            session.beginTransaction();

            session.update(car);

            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(@NotNull final Car car) {

        try (Session session = factory.openSession()) {

            session.beginTransaction();

            session.delete(car);

            session.getTransaction().commit();
        }
    }
}
