public class AnimalMosca implements Animal{

    public String caracteristica;

    public AnimalMosca(){

    }

    public AnimalMosca(String caracteristica){
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica(){
        return caracteristica;
    }

    public String getEstrutura(){
        return "Mosca";
    }

}