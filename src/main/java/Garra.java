public class Garra extends AnimalDecorator {

    public Garra(Animal animal){
        super(animal);
    }

    public String getResponse(){
        return "Possui Garra";
    }

    public String getNomeEstrutura(){
        return "Garra";
    }

    public String getCaracteristica() {
        return null;
    }


}
