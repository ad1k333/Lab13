package com.company;

class surgeon implements Doctor {
    @Override
    public void operation() {
        System.out.println("Body part: Legs, arms");
    }

    @Override
    public void instruments() {
        System.out.println("Instruments: Scissors, medical knife");

    }
}
