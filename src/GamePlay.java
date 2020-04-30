public class GamePlay {
    private TrainerPlay trainerPlay;
    private Enermy enermy;

    public GamePlay(String name){
        trainerPlay = new TrainerPlay(name);
    }

    public String getTName(){
        return trainerPlay.getName();
    }

    public void setTName(String name){
        trainerPlay.setName(name);
    }

    public Pokemon getPokemon(int index) {
        return trainerPlay.getPokemon(index);
    }

    public void setPokemon(int index, Pokemon pokemon){
        trainerPlay.setPokemon(index,pokemon);
    }

    public void addPokemon(Pokemon monster){
        trainerPlay.addPokemon(monster);
    }

    public void setPokemonName(String name, int index) {
        Pokemon monster = trainerPlay.getPokemon(index);
        monster.setName(name);
        trainerPlay.setPokemon(index, monster);
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

    public void makeEnemy() {
        Pokemon pokemon = enermy.getPokemon(0);
        pokemon.fullHP();
        enermy.set(pokemon);
    }

}
