import java.util.ArrayList;

public abstract class PokemonTrainer {
    protected String name;

    protected ArrayList<Pokemon> bag = new ArrayList<Pokemon>();

    public PokemonTrainer(){

    }

    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBag(){
        return bag.size();
    }

    public Pokemon getPokemon(int index){
        return bag.get(index);
    }

    public void setPokemon(int index,Pokemon monster){
        bag.remove(index);
        bag.add(index,monster);
    }

    public void addPokemon(Pokemon monster){
        bag.add(monster);
    }

    public void rmPokemon(int index){
        bag.remove(index);
    }




}
