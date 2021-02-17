package org.fasttrackit;

public class Dog extends Animall{

    private double barkPower;

    public double getBarkPower()
    {
        return barkPower;
    }

    public void setBarkPower( double barkPower)
    {
        this.barkPower = barkPower;
    }

    public void sleeping(){
        System.out.println(getName() + " is sleeping well!");
    }

    @Override
    public void expressJoy() {
        super.expressJoy();
    }
}

