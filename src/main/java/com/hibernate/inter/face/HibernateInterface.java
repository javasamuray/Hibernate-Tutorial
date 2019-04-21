package com.hibernate.inter.face;

public interface HibernateInterface<Entity, Key> {

    void create(Entity entity);

    Object read(int key);

    void update(Entity entity);

    void delete(Entity entity);
}
