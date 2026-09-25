
//stats
class Stats{
    
    private double mana;
    private double str;
    private double hp;
    private double gold;

    Stats(double mana, double str, double hp,double gold){
        this.mana=mana;
        this.str=str;
        this.hp=hp;
        this.gold=gold;
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

    void  Family(){

    if(gold <= 70){
        System.out.println("Your are born in the Slum.");
        System.out.println("+10 gold");
        
    }
    else if(gold <= 20){
        System.out.println("Your are born in the farming land.");
        System.out.println("+25 gold");
    }
    else if(gold <= 10){
        System.out.println("You are bron in a merchant family. ");
        System.out.println("+50 gold");
    }
    else if(gold <= 5){
        System.out.println("Your are a member of Royal family. ");
        System.out.println("+100 gold");
    }


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

        System.out.println("++++++=================STATS===================++++++");
        System.out.println("===|HP:" + stats.getHp() + "|==|STR:"+ stats.getStr() + "\n|==|MP:" + stats.getMana() + "|==|Gold:" +stats.getGold());
    }


}

