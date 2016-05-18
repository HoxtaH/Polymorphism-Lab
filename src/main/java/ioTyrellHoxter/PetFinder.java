package ioTyrellHoxter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tyrellhoxter on 5/4/16.
 */
public class PetFinder {

    public int animalNumber;

    public Scanner sc = new Scanner(System.in);
    List<Pets> animalList = new ArrayList<Pets>();

    public void HowManyPets(){
        System.out.println("How Many Pets Do You Own?");
        Scanner scanner = new Scanner(System.in);
        animalNumber = scanner.nextInt();
    }

    public String whatAreTheirNames(){
        System.out.println("What are their names?");
        return sc.next();
    }

    public String whatTypesOfPets(){
        System.out.println("What type of Pets are They");
        return sc.next();
    }

    public void petRun() {
        HowManyPets();
        for(int i = 0; i < animalNumber; i++) {
            String animalNames = whatAreTheirNames();
            String petTypes = whatTypesOfPets();
        switch (petTypes.toLowerCase()){
            case "cat": animalList.add(new Cats(animalNames, petTypes));

                break;
            case "dog" : animalList.add(new Dogs(animalNames, petTypes));
                break;
            case "lochness": animalList.add(new LochnessMonster(animalNames,petTypes));
                break;
            default:
                System.out.println("No such animal exist Baby!");
        }
            System.out.println("You have a pet named " + animalList.get(i).getName() + " and it says ");
            animalList.get(i).speak();
            }
        }

    }
