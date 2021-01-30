package org.fasttrackit;

public class App
{
    public static void main( String[] args )

    {
        System.out.println(" ");
        System.out.println( "Animal project" );

        Animall animal; // animal este referinta catre adresa alocata obiectului Animal
        animal = new Animall();

        animal.name = "Puf";
        animal.favouritefood = "Carne";
        animal.happinesactivity = "Plimbare in aer liber";
        animal.age = 1;
        animal.health = 10;
        animal.hunger= 7;
        animal.happines = 10;

        System.out.println(" ");

        System.out.println("Numele animalului este: " +animal.name);
        System.out.println("Mancarea preferata a animalului este: " +animal.favouritefood);
        System.out.println("Activitatea preferata a animalului este: " +animal.happinesactivity);
        System.out.println("Varsta animalului este: " +animal.age + " an");
        System.out.println("Nivelul sanatatii animalului (de la o scara de 0-10 ) este: " +animal.health);
        System.out.println("Nivelul de foame al animalului (de la o scara de 0-10 ) este: " +animal.hunger);
        System.out.println("Nivelul de fericire al animalului (de la o scara de 0-10 ) este: " +animal.happines);

        Owner owner = new Owner();

        owner.name = "Eugen";
        owner.money = 1000;

        System.out.println(" ");

        System.out.println("Numele proprietarului este: " + owner.name);
        System.out.println("Suma de bani alocata animalului saptamanal este de: " + owner.money + " lei");

        AnimalFood food = new AnimalFood();

        food.name = "Conserva carne";
        food.price = 10;
        food.cantity = 250; // grame
        food.expiredate = 10102021;
        food.availability = true;

        System.out.println(" ");

        System.out.println("Mancare pentru animal: " + food.name);
        System.out.println("Disponibilitate: ");
        if (food.availability == true) System.out.println("Da");
        else System.out.println("Nu");
        System.out.println("Pretul mancarii este de: " + food.price + " lei");
        System.out.println("Cantitatea de mancare este de: " + food.cantity + " grame");
        System.out.println("Data expirarii: " + food.expiredate);

        Activity activity = new Activity ();

        activity.name = "Alergare in parc";

        System.out.println(" ");

        System.out.println("Activitatea de astazi a animalului este: " + activity.name);

        AnimalDoctor doctor = new AnimalDoctor();

        doctor.name = "Mihai";
        doctor.speciality = "Medicina veterinara generala";

        System.out.println(" ");

        System.out.println("Numele doctorului veterinar este: " + doctor.name);
        System.out.println("Specialitatea: " + doctor.speciality);

    }
}
