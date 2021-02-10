package org.fasttrackit;

public class Game {

    private Owner owner;
    private Animall animal;
    private MedicalStaff medic;

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
