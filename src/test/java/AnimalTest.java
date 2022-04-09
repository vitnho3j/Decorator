import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void deveRetornarCaracteristicasAnimalMosca() {

        Animal animal = new AnimalMosca("Mosca");

        assertEquals("Mosca", animal.getEstrutura());
    }

    @Test
    public void deveRetornarCaracteristicasAnimalGato(){
        Animal animal = new Cauda(new Garra(new AnimalGato("Gato")));

        assertEquals("Gato/Garra/Cauda", animal.getEstrutura());
    }
    @Test
    public void deveRetornarCaracteristicasAnimalCobra() {
        Animal animal = new Cauda(new AnimalCobra("Cobra"));

        assertEquals("Cobra/Cauda", animal.getEstrutura());
    }
    @Test
    public void deveRetornarCaracteristicasAnimalAguia(){
        Animal animal = new Cauda(new Garra(new Pena(new AnimalAguia("Aguia"))));

        assertEquals("Aguia/Pena/Garra/Cauda", animal.getEstrutura());
    }
}


