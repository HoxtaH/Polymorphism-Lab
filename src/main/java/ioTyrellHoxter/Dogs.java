package ioTyrellHoxter;

/**
 * Created by tyrellhoxter on 5/5/16.
 */
public class Dogs extends Pets {
    public Dogs(String name, String types){
        super(name, types);
    }

    public void speak(){
        System.out.println("Bark Bark Woof");
    }
}
