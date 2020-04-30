public class Trainer extends PokemonTrainer {
    private int coin;
    private int food;
    protected String path;

    public Trainer(String name){
        this.name = name;

    }

    public int getCoin(){
        return coin;
    }

    public void decCoin(int n) {
        coin -= n;
    }

    public int getFood(){
        return food;
    }

    public void incFood(int n) {
        food += n;
    }

    public void decFood(int n) {
        food -= n;
    }
}
