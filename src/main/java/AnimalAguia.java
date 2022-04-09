public class AnimalAguia implements Animal{

    public String caracteristica;

    public AnimalAguia(){

    }

    public AnimalAguia(String caracteristica){
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica(){
        return caracteristica;
    }

    public String getEstrutura(){
        return "Aguia";
    }

}