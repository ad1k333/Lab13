package com.company;

class neurosurgeon implements Doctor {


    @Override
    public void operation() {
        System.out.println("Body part: Brain");
    }

    @Override
    public void instruments() {
        System.out.println("Instruments: Micropincets, Vessel clamp");

    }
}
