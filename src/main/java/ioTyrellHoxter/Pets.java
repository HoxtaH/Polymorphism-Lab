package ioTyrellHoxter;

/**
 * Created by tyrellhoxter on 5/5/16.
 */
public class Pets {

    public String names;
    public String types;

    public Pets(String name,String types ){
        this.names = name;
        this.types = types;
    }

    public void speak(){
        System.out.println("Pet God");
    }

    public String getName() {
        return names;
    }

}

