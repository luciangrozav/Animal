package org.fasttrackit;

import java.time.LocalDateTime;

public class App
{
    public static void main( String[] args )

    {
        System.out.println(" ");
        System.out.println( "Animal project" );

        Owner owner = new Owner();
        owner.setName("John");
        owner.setMoney(300);

        Animall animal = new Animall ();
        animal.setName("Bobby Fischer");
        animal.setAge(2);
        animal.setHealthLevel(10);
        animal.setHappinessLevel(10);
        animal.setFavoriteActivityName("Running");
        animal.setFavoriteFoodName("Meat");

        Activity activity = new Activity("Running");

        AnimalFood food = new AnimalFood("Purina");
        food.setQuantity(100);
        food.setPrice(80);
        food.setInStock(true);
        food.setExpiryDate(LocalDateTime.of(2021,2,10,18,8,0));

        MedicalStaff medic = new MedicalStaff();
        medic.setName("Dr. House");
        medic.setSpecialization("GeneralMedicine");

        Game game = new Game();
        game.setOwner(owner);
        game.setAnimal(animal);
        game.setMedic(medic);

        owner.feed(animal, food);
        owner.entertain(animal, activity);

    }
}
