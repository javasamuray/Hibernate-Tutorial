package com.hibernate.model;

import java.util.Objects;

public class Engine {

    private int id;

    private String model;

    private int power;

    public Engine() {
    }

    public Engine(int id) {
        this.id = id;
    }

    public Engine(int id, String model, int power) {
        this.id = id;
        this.model = model;
        this.power = power;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return getId() == engine.getId() &&
                getPower() == engine.getPower() &&
                getModel().equals(engine.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getModel(), getPower());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }

    public String getEngine(Engine engine) {
        return engine.toString();
    }
}