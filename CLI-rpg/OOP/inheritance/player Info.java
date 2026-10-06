
//stats
class Stats {
    
    private double mana;
    private double str;
    private double hp;
    private double gold;

    Stats(double mana, double str, double hp,double gold){
        this.mana=mana;
        this.str=str;
        this.hp=hp;
    }
    public double getMana(){
        return mana;
    }
    public double getStr(){
        return str;
    }
    public double getHp(){
        return hp;
    }
    public double getGold(){
        return gold;
    }
}

class PlayerInfo{
    private character_creation character;
    private Stats stats;

    PlayerInfo(character_creation character, Stats stats){
    this.character = character;
    this.stats = stats;
    }

    void displayPlayer(){

        System.out.println("++++++=============================STATS============================++++++");
        System.out.println("===|HP:" + stats.getHp() + "|==|STR:"+ stats.getStr() + "\n|==|MP:" + stats.getMana() + "|==|Gold:" +stats.getGold());
    }


}

