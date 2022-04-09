public class Cauda extends AnimalDecorator {

    public Cauda(Animal animal){
        super(animal);
    }

    public String getResponse(){
        return "Possui Cauda";
    }

    public String getNomeEstrutura(){
        return "Cauda";
    }

    public String getCaracteristica() {
        return null;
    }
}
