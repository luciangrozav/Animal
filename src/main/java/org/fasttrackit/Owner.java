package org.fasttrackit;

public class Owner {  // Adoptator

    private String name;
    private double money;

    public String getName ()
    {
        return name;
    }
    public void setName (String name)
    {
        this.name = name;
    }

    public double getMoney()
    {
        return money;
    }
    public void setMoney(double money)
    {
        this.money = money;
    }

    public void feed (Animall animal , AnimalFood food)
    {
        System.out.println(this.name + " just gave some " + food.getName() + " food to " + animal.getName());

    }

    public void entertain (Animall animal, Activity activity)
    {
        System.out.println(this.name + " is playing " + activity.getName() + " with " + animal.getName());
    }



}
