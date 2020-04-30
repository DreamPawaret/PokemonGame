
public class TrainerPlay extends Trainer {
    private int coin;
    private int food;
    protected String path;

    public TrainerPlay(String name){
        this.name = name;

    }

    public String getpPath(){
        return path;
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
