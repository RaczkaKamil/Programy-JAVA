package com.company;

public class Addition implements Computation {
    @Override
    public double compute(double argument1, double argument2) {
        return argument1 + argument2;
    }
}
