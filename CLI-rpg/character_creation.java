import java.util.ArrayList;

class character_creation{ 

     //inventory
    private ArrayList<String> inventory = new ArrayList<>();
    private ArrayList<String> skill = new ArrayList<>();
    //inventory logic 

    //add
    void addItem(String item){
        inventory.add(item);
    }
    void addSkill(String newSkill){
        skill.add(newSkill);
    }
    //remove 
    void removeItem(String item){
       if(inventory.remove(item)){
          System.out.println(item);
       }
       else {
          System.out.println("You dont have that item.");
       }
    }
    void removeSkill(String newSkill){
       if(skill.remove(newSkill)){
          System.out.println(newSkill + "removed");
       }
       else {
          System.out.println("You dont have that skill.");
       }
    }
    //show 
    void showInventory(){
        if(inventory.isEmpty()){
            System.out.print("You dont have any Item yet.");
        }
        else{
            for(String item : inventory){
                System.out.println("- " + item);
            }
        }
    }
    void showSkill(){
        if(skill.isEmpty()){
            System.out.print("You dont have any Item yet.");
        }
        else{
            System.out.println("Skill: ");
            for(String s : skill){
                System.out.println("- " + s);
            }
        }
    }




    //atrributes of characters
    private String name; 
    private int race;
    private int clas; 

 

    character_creation(String name, int race, int clas){
        setName(name);
        setRace(race);
        this.clas = clas;
      
    }
    //setter for name
    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } 
        else if(name.length() >= 10){
            this.name = "Name is too long. Please enter a name with less than 10 characters.";
        }
        else {
            System.out.println("Name cannot be empty.");
        }
    }
     public void setRace(int race) {
       this.race = race;
    }
    
    //getters
    public String getName() {
        return name;
    }
    public int getRace() {
        return race;
    }
    public int getCharacterClass() {
        return clas;
    }


    void Display(){
        System.out.println("Name: "+ getName());
        switch (getRace()) {
            case 1:
            System.out.println("Race: Human");
            break;
            case 2:
            System.out.println("Race: Elf");
            break;
            case 3:
            System.out.println("Race: Dwarf");
            break;
        }   
    }
}

class Warrior extends character_creation {

    private int basicskill;
    Warrior(String name, int race, int clas, int basicskill){
        super(name, race, clas );
        setBasicSkill(basicskill); 

    }
    //setter
    void setBasicSkill(int basicskill) {
        double damage;
         
        if (basicskill == 1) {
            this.basicskill = basicskill;
            damage = 2.5;
            
        }else if (basicskill == 2) {
            this.basicskill = basicskill;
            damage = 2.5;
        } else {
            System.out.println("Invalid basic skill choice.");
        }
    }
    //getter
    public int getBasicSkill() {
        return basicskill;
    }

    @Override
    void Display(){
       super.Display();
        if (getBasicSkill() == 1) {
            System.out.println("Basic Skill: Sword slash");
        } else if (getBasicSkill() == 2) {
            System.out.println("Basic Skill: Sword stab");
        } else {
            System.out.println("Invalid basic skill choice.");
        }
    }

}



class Archer extends character_creation {

    private int basicskill;
    Archer(String name, int race, int clas, int basicskill){
        super(name, race, clas );
        this.basicskill = basicskill; 

    }
        void setBasicSkill(int basicskill) {
               double damage;
         
        if (basicskill == 1) {
            this.basicskill = basicskill;
            damage = 2.5;
            
        }else if (basicskill == 2) {
            this.basicskill = basicskill;
            damage = 2.5;
        } else {
            System.out.println("Invalid basic skill choice.");
        }
       
    }
    public int getBasicSkill() {
        return basicskill;
    }

    @Override
    void Display(){
        super.Display();
        if (getBasicSkill() == 1) {
            System.out.println("Basic Skill: long shot");
        } else if (getBasicSkill() == 2) {
            System.out.println("Basic Skill: Arrow rain");
        } else {
            System.out.println("Invalid basic skill choice.");
        }
    }

}
class Mage extends character_creation {

    private int basicskill;
    Mage(String name, int race, int clas, int basicskill){
        super(name, race, clas );
        this.basicskill = basicskill; 

    }
    void setBasicSkill(int basicskill) {
        double damage;
         
        if (basicskill == 1) {
            this.basicskill = basicskill;
            damage = 2.5;
            
        }else if (basicskill == 2) {
            this.basicskill = basicskill;
            damage = 2.5;
        } else {
            System.out.println("Invalid basic skill choice.");
        }
    }
    public int getBasicSkill() {
        return basicskill;
    }

    @Override
    void Display(){
        super.Display();
        if (getBasicSkill() == 1) {
            System.out.println("Basic Skill: Fireball");
        } else if (getBasicSkill() == 2) {
            System.out.println("Basic Skill: Ice Shard");
        } else {
            System.out.println("Invalid basic skill choice.");
        }
    }


   
}

