import java.util.ArrayList;

public abstract class PokemonTrainer {
    protected String name;

    protected ArrayList<Pokemon> bag = new ArrayList<Pokemon>();

    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Pokemon random(String name){
        int ran = (int)(Math.random()*5);
        if(ran == 0)
            return new Pikachu("Pikachu");
        else if (ran == 1)
            return new Bulbasaur("Balbasaur");
        else if (ran == 2)
            return new Charmander("Charmander");
        else if (ran == 3)
            return new Squirtle("Squirtle");
        else if (ran == 4)
            return new Magikarp("Magikaep");
        return null;
    }

}
