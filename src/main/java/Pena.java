public class Pena extends AnimalDecorator {

    public Pena(Animal animal){
        super(animal);
    }

    public String getResponse(){
        return "Possui Pena";
    }

    public String getNomeEstrutura(){
        return "Pena";
    }

    public String getCaracteristica() {
        return null;
    }


}
