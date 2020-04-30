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

    public Pokemon getPokemon(int n){
        return bag.get(n);
    }

    public void setPokemon(int n,Pokemon monster){
        bag.remove(n);
        bag.add(n,monster);
    }

    public void addPokemon(Pokemon monster){
        bag.add(monster);
    }

    public void rmPokemon(int n){
        bag.remove(n);
    }




}
