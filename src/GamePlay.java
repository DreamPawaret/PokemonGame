public class GamePlay {
    private PokemonTrainer pokemonTrainer;
    private Enermy enermy;

    public GamePlay(String name){
       
    }

    public String getTName(){
        return pokemonTrainer.getName();
    }

    public void setTName(String name){
        pokemonTrainer.setName(name);
    }

    public Pokemon getPokemon(int index) {
        return pokemonTrainer.getPokemon(index);
    }

    public void setPokemon(int n, Pokemon pokemon){
        pokemonTrainer.setPokemon(n,pokemon);
    }

    public void addPokemon(Pokemon monster){
        pokemonTrainer.addPokemon(monster);
    }

    public void setPokemonName(String name, int n) {
        Pokemon monster = pokemonTrainer.getPokemon(n);
        monster.setName(name);
        pokemonTrainer.setPokemon(n, monster);
    }


    public int getBag(){
        return pokemonTrainer.getBag();
    }



}
