package com.hibernate.metod.forgist;

import com.hibernate.inter.face.HibernateInterface;
import com.hibernate.model.Engine;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;


public class HibernateMethodForEngine implements HibernateInterface<Engine, Integer> {

    private final SessionFactory factory;

    public HibernateMethodForEngine(@NotNull final SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public void create(@NotNull final Engine entity) {

        try (final Session session = factory.openSession()) {

            session.beginTransaction();

            session.save(entity);

            session.getTransaction().commit();
        }
    }
    @Override
    public Engine read(@NotNull int id) {

        Engine result;
        try (final Session session = factory.openSession()) {

            result = session.get(Engine.class, (Serializable) id);

            if (result != null) {
                Hibernate.initialize(result.getEngine(result));
            }

        }
        return result;
    }

    @Override
    public void update(@NotNull Engine engine) {

        try (Session session = factory.openSession()) {

            session.beginTransaction();

            session.update(engine);

            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(@NotNull Engine engine) {

        try (Session session = factory.openSession()) {

            session.beginTransaction();

            session.delete(engine);

            session.getTransaction().commit();
        }
    }

}
