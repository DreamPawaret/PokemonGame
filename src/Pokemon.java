import java.lang.*;

public abstract  class Pokemon {
    protected String name;
    protected String trainer;
    protected String type;
    protected int curHP;
    protected int maxHP;
    protected int upHP;
    protected int cp;
    protected int maxCP;
    protected int atk;
    protected int def;
    protected String pPath;

    public void Pokemon(String name,String trainer, int hp, int atk, int def) {
        this.name = name;
        this.type = name;
        this.trainer = trainer;
        maxHP = hp;
        curHP = hp;
        upHP = hp*2;
        this.atk = atk;
        this.def = def;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public String toString(){
        return name;
    }

    public String getTrainer(){
        return trainer;
    }

    public void setTrainer(){
        this.trainer = trainer;
    }

    public int getCurHPHp(){
        return curHP;
    }

    public int getMaxHP(){
        return maxHP;
    }

    public int getUpHP(){
        return upHP;
    }

    public void fullHP(){
        curHP = maxHP;
    }

    public int getCp(){
        return cp;
    }

    public int getAtk(){
        return atk;
    }

    public void damage(int atk){
        atk = atk-this.def;
        int currentHP = curHP - atk;
        if(currentHP >= 0)
            this.curHP = currentHP;
        else
            this.curHP = 0;
    }

    public boolean feed(int food){
        /*if(maxHP == curHP){


        curHP = curHP+10;*/
        if (maxHP == curHP) {
            return false;
        } else {
            curHP = curHP +food;
            if (curHP > maxHP) {
                curHP = maxHP;
            }
            return true;
        }
    }

}
