import java.util.ArrayList;

public class GUI {
    private ArrayList<Pokemon> bag;
    public void Pokeworld(){
        bag = new ArrayList<Pokemon>();
        bag.add(new Pikachu("Pikachu"));
    }

    public void play(){

    }

    public void printPokemon(){
        System.out.println("Bag");
        for(Pokemon p: bag){
            System.out.println(p);
        }
    }

}
