import java.lang.*;

public abstract  class Pokemon {
    private String name;
    private String trainer;
    private int hp;
    private int maxHP;
    private int cp;
    private int maxCP;
    private int atk;
    private int def;

    public void Pokemon(String name, int hp, int cp) {
        this.name = name;
        this.name = trainer;
        //this.hp = (int)(Math.random()*100*hp);
        this.cp = (int)(Math.random()*50*cp);
        System.out.println("Pokemon: "+name+" hp:"+hp+" cp:"+cp);
    }

    public String getStatus(){
        return name+" "+hp;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name;
    }
    public String getTrainer(){
        return trainer;
    }
    public int getHp(){
        return hp;
    }
    public int getCp(){
        return cp;
    }

    public void damage(int atk){
        atk = atk-this.def;
        int currentHP = hp - atk;
        if(currentHP >= 0)
            this.hp = currentHP;
        else
            this.hp = 0;
    }

    public void feed(){
        if(maxHP == hp){

        }
        hp = hp+10;
    }

}
