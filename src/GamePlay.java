public class GamePlay {
    private PokemonTrainer pokemonTrainer;
    private Enermy enermy;

    public GamePlay(String name){
        pokemonTrainer = new PokemonTrainer(name);
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
        return trainerPlay.getBag();
    }

    public int getCoin(){
        return trainerPlay.getCoin();
    }

    public int getFood(){
        return trainerPlay.getFood();
    }

    public int getUpHP(int index){
        Pokemon pokemon =trainerPlay.getPokemon(index);
        return pokemon.getUpHP();
    }


    public void decCoin(int cn){
        trainerPlay.decCoin(cn);
    }

    public void decFood(int fd){
        trainerPlay.decFood(fd);
    }

    public boolean feed(int index) {
        Pokemon pokemon = getPokemon(index);
        boolean fd = pokemon.feed(pokemon.getUpHP());
        trainerPlay.setPokemon(index, pokemon);
        return fd;
    }


}
