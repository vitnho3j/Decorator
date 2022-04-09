public class AnimalGato implements Animal{

    public String caracteristica;

    public AnimalGato(){

    }

    public AnimalGato(String caracteristica){
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica(){
        return caracteristica;
    }

    public String getEstrutura(){
        return "Gato";
    }

}
