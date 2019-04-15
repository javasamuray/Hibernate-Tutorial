package com.hibernate.model;

import java.util.Objects;

public class Car {

    private int id;

    private String mark;

    private String model;

    private Engine engine;

    public Car() {
    }

    public Car(int id, String mark, String model, Engine engine) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getId() == car.getId() &&
                getMark().equals(car.getMark()) &&
                getModel().equals(car.getModel()) &&
                getEngine().equals(car.getEngine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMark(), getModel(), getEngine());
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
