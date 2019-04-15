package com.hibernate.hibe_metod;

import com.hibernate.inf.HibernateInterface;
import com.hibernate.model.Engine;

public class HibernateMethodForEngine implements HibernateInterface<Engine, Integer> {

    @Override
    public void create(Engine entity) {

    }

    @Override
    public Engine read(Integer integer) {
        return null;
    }

    @Override
    public void update(Engine engine) {

    }

    @Override
    public void delete(Engine engine) {

    }
}
