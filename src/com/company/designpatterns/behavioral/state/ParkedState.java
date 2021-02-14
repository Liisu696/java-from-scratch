package com.company.designpatterns.behavioral.state;

public class ParkedState implements PilotActions {
    F16 f16;

    public ParkedState(F16 f16) {
        this.f16 = f16;
    }

    @Override
    public void pilotTaxies(F16 f16) {
        System.out.println("State changed");
    }

    @Override
    public void pilotFlies(F16 f16) {
        System.out.println("State changed");
    }

    @Override
    public void pilotLands(F16 f16) {
        System.out.println("State changed");
    }

    @Override
    public void pilotParks(F16 f16) {
        System.out.println("State changed");
    }
}
