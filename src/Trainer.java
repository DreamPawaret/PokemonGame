public class Trainer extends PokemonTrainer {
    private int money = 2000;
    private int food;
    protected String path;

    public Trainer(String name){
        this.name = name;
    }

    public int getMoney(){
        return money;
    }

    public void decMoney(int n) {
        money -= n;
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
