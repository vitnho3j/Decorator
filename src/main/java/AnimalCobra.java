public class AnimalCobra implements Animal{

    public String caracteristica;

    public AnimalCobra(){

    }

    public AnimalCobra(String caracteristica){
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica(){
        return caracteristica;
    }

    public String getEstrutura(){
        return "Cobra";
    }

}