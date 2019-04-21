package com.hibernate.inter.face;

import com.hibernate.model.Engine;

public interface HibernateInterface<Entity, Key> {

    void create(Engine entity);

    Object read(Key key);

    void update(Entity entity);

    void delete(Entity entity);
}
