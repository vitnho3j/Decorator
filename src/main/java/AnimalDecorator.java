public abstract class AnimalDecorator implements Animal {

    private Animal animal;
    public String estrutura;

    public AnimalDecorator(Animal animal){
        this.animal = animal;
    }

    public Animal getAnimal(){
        return animal;
    }

    public void setAnimal(Animal animal){
        this.animal = animal;
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura(){
        return this.animal.getEstrutura() + "/" + this.getNomeEstrutura();
    }


    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

}
