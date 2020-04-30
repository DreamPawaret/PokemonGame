public abstract class Berry {
    protected String name;
    protected int heal;

    public Berry(String name,int heal){
        this.name = name;
        this.heal = heal;
    }

    public int getTreatment(){
        return heal;
    }
}
