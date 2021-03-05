package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Owner owner;
    private Animall animal;
    private MedicalStaff medic;

    private List<AnimalFood> availableFood =  new ArrayList<>();
    private Activity[] availableActivities = new Activity[5];

    public void start()
    {
        initFood();
        initActivities();

        displayFood();
        displayActivities();
    }

    private void initFood ()
    {
    AnimalFood food1 = new AnimalFood();
    AnimalFood food2 = new AnimalFood();
    food1.setName("Boabe");
    food2.setName("Carne de pui");
    availableFood.add(food1);
    availableFood.add(food2);
    }

    private void initActivities()
    {
        Activity activity1 = new Activity();
        Activity activity2 = new Activity();
        activity1.setName("Alergat");
        activity2.setName("Plimbare");
        availableActivities[0] =  activity1;
        availableActivities[1] = activity2;
    }
    private void displayFood()
    {
        System.out.println("Available food!");
        for(AnimalFood animalFood:availableFood)  //enhanced 'for'
        {
            if(animalFood!= null)
            System.out.println(animalFood.getName());
        }
    }

    private void displayActivities()
    {
        System.out.println("Available activities!");
        for(int i=0; i< availableActivities.length; i++)  // classic 'for'
        {   if(availableActivities[i]!= null)
            System.out.println("Activity " + (i+1) + " " + availableActivities[i].getName());
    }
    }

    public Owner getOwner()
    {
        return owner;
    }
    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }
    public Animall getAnimal ()
    {
        return animal;
    }
    public void setAnimal (Animall animal)
    {
        this.animal = animal;
    }
    public MedicalStaff getMedic ()
    {
        return medic;
    }
    public void setMedic( MedicalStaff medic)
    {
        this.medic = medic;
    }

}
