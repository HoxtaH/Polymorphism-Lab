package ioTyrellHoxter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by tyrellhoxter on 5/4/16.
 */
public class PetFinderSpec {
    @Test
    public void HowManyPetsTest(){
        PetFinder petFinder = new PetFinder();
        int actualFinder = petFinder.animalNumber + 1;
        int expectedFinder = 1;
        Assert.assertEquals("The expected output should be 8", actualFinder, expectedFinder);
    }

    @Test
    public void petConstructorTest(){
        Pets pets = new Pets("Nessy", "Cat");
        String expected = "Nessy";
        String actual = pets.names;
        Assert.assertEquals("The expected name should be Nessy", expected, actual);
    }
}
