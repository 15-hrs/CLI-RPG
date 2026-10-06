import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException{
        Scanner imp = new Scanner(System.in);
        character_creation[] characters = new character_creation[5];
        Random rand = new Random();
        
      
        int choice;

        do{
        System.out.println("===========Dungeon and Dragons===========");
        System.out.println("1. Play Game");
        System.out.println("2. Create Character");
        System.out.println("3. Display Characters");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        
        choice = imp.nextInt();
        imp.nextLine(); 
        Thread.sleep(1000); 

        int slot = 0;
        switch(choice){
            case 1:
            if(characters[0] != null){

                //part where select a character
                System.out.println("Select a character to play With:");
                for(int i = 0; i < characters.length; i++){
                    if(characters[i] != null){
                    System.out.println("_______________________________");
                    System.out.println("Character: " + (i + 1) + ":");  
                    characters[i].Display();
                 }
                }

                int selectCharacter;
                do{
                System.out.println("_______________________________");
                System.out.println("Select a Slot to play: ");
                selectCharacter = imp.nextInt();
                imp.nextLine();
                 
                if (selectCharacter < 1 || selectCharacter >5){
                    System.out.println("Invalid slot");
                }
                else if (characters[selectCharacter - 1] == null){
                    System.out.println("The slot is emty");
                    
                }
                }while(selectCharacter < 1 || selectCharacter > 5 || characters[selectCharacter -1] == null );
                character_creation player = characters[selectCharacter -1];
                    
                //loading part
                    System.out.print("||loading: ==== ");
                    Thread.sleep(700);
                    System.out.print("============ ");
                    Thread.sleep(2000);
                    System.out.print("=====||\n");
                    Thread.sleep(2000);
                    
                    System.out.println("===========================");
                    System.out.println("====DUNGEON AND DRAGONS===="); 
                    System.out.println("===========================");
                    Thread.sleep(2000);
                    System.out.println("________________________________________________________________________________________________________________");
                    System.out.println(  "The Legend of the Forgotten Dungeon\n");
                    Thread.sleep(1000);
                    System.out.println(  "Long before the kingdoms were divided, the land was ruled by three ancient races: Humans, Elves, and Dwarves.\n" + 
                                         "For centuries, they lived separately. Humans built great kingdoms,\n" +
                                         "Elves guarded the ancient forests,\n" +
                                         "and Dwarves carved enormous cities beneath the mountains.\n" + 
                                         "Then, one night, the sky turned black.\n");
                    Thread.sleep(5000);
                    System.out.println("A massive dungeon appeared beneath the oldest mountain.\n" + 
                                       "Nobody knew where it came from. Some believed it was created by an ancient god.\n" +
                                       "Others believed it had always existed, waiting for someone to discover it.\n" + 
                                       "The dungeon became known as.. ");
                    Thread.sleep(5000);
                    System.out.print("The Forgotten Dungeon.\n ");
                    System.out.println("________________________________________________________________________________________________________________");
                    Thread.sleep(6000);
                    imp.nextLine();
                    

                 
//start of Game                    
                    System.out.println("Your adventure starts here. "); 
                 

                    
                    
                    
                    


            } else {
                System.out.println("--------------------------------");
                System.out.println("Please create a character first.");
                System.out.println("--------------------------------");
                Thread.sleep(700);
            }
            
            
            break;

            case 2:
                 for(int i = 0; i < characters.length; i++){
                    if(characters[i] == null){
                        if(slot <= 5) {
                        System.out.println("_______________________________");
                        System.out.println("Creating character " + (i + 1) + ":");
                        System.out.print("Enter your character's name: ");
                        String name = imp.nextLine();
                        int race;

                        do {
                        System.out.println("_______________________________");
                        System.out.println("Race Options:");
                        System.out.println("\n1. Human\n2. Elf\n3. Dwarf");
                        System.out.println("Pick a race: ");
                        race = imp.nextInt();
                        imp.nextLine();
                        }while(race < 1 || race > 3);

                       
                        System.out.println("_______________________________");
                        System.out.println("Class Options:");
                        System.out.println("\n1. Warrior\n2. Archer\n3. Mage");
                        System.out.println("Enter your character's class: ");
                        int classChoice = imp.nextInt();
                        imp.nextLine();

                        if (classChoice == 1) {

                            Thread.sleep(1000); 
                            System.out.println("-------------------------------");
                            System.out.println("You now belong to the Warrior class.");
                            System.out.println("-------------------------------");
                            Thread.sleep(1000); 
                            int basicSkill; 

                        do{  
                            System.out.println("_______________________________");
                            System.out.println("Basic skills: ");
                            System.out.println("1. Sword slash");
                            System.out.println("2. Sword stab");
                            
                            System.out.println("Choice a character's  basic skill: ");
                            basicSkill = imp.nextInt();
                            imp.nextLine();
                          
                              
                            //new character
                            characters[i] = new Warrior(name, race, classChoice, basicSkill);
                            int family = rand.nextInt(100);
                        /*    Stats stats = new Stats(1, 1, 5, family);
                            PlayerInfo player = new PlayerInfo(characters[i], stats); */
                            slot++;
                            characters[i].addItem("Sword1");
                           

                            //adding skill in the inventory
                            if(basicSkill == 1){
                                characters[i].addSkill("Sword slash");
                            }
                            else if(basicSkill == 2){
                                characters[i].addSkill("Sword stab");
                            }


                             //error handling for invalid basic skill choice
                             if(basicSkill != 1 && basicSkill != 2) {
                            System.out.println("______________________________________________________________");
                            System.out.println("Invalid basic skill choice. Please try again.");
                            System.out.println("______________________________________________________________");
                            } 
                            
                           
                           
                        } while (basicSkill != 1 && basicSkill != 2);

                      
                        } else if (classChoice == 2) {

                         
                            Thread.sleep(1000);
                            System.out.println("-------------------------------");
                            System.out.println("You now belong to the Archer class.");
                            System.out.println("-------------------------------");
                            Thread.sleep(1000); 
                        int basicSkill;
                        do{ 
                            System.out.println("_______________________________");
                            System.out.println("Basic skills: ");
                            System.out.println("1. Long shot");
                            System.out.println("2. Arrow rain");
                            System.out.println("Choice a character's  basic skill: ");
                            basicSkill = imp.nextInt();
                            imp.nextLine();

                         if(basicSkill != 1 && basicSkill != 2) {
                            System.out.println("______________________________________________________________");
                            System.out.println("Invalid basic skill choice. Please try again.");
                            System.out.println("______________________________________________________________");
                        }  
                        } while (basicSkill != 1 && basicSkill != 2);
                            
                            characters[i] = new Archer(name, race, classChoice, basicSkill);
                            slot++;
                            characters[i].addItem("bow1");

                            //adding skill in the inventory
                            if(basicSkill == 1){
                                characters[i].addSkill("Long shot");
                            }
                            else if(basicSkill == 2){
                                characters[i].addSkill("Arrow rain");
                            }

                        }
                         else if (classChoice == 3) {
                            Thread.sleep(1000); 
                            System.out.println("-------------------------------");
                            System.out.println("You now belong to the Mage class.");
                            System.out.println("-------------------------------");
                            Thread.sleep(1000); 
                        int basicSkill;
                        do{
                            System.out.println("_______________________________");
                            System.out.println("Basic skills: ");
                            System.out.println("1. Fireball");
                            System.out.println("2. Ice Shard");
                            System.out.println("Choice a character's  basic skill: ");
                            basicSkill = imp.nextInt();
                            imp.nextLine();
                            
                         if(basicSkill != 1 && basicSkill != 2) {
                            System.out.println("______________________________________________________________");
                            System.out.println("Invalid basic skill choice. Please try again.");
                            System.out.println("______________________________________________________________");
                        }  
                        } while (basicSkill != 1 && basicSkill != 2);
                        //new character
                          characters[i] = new Mage(name, race, classChoice, basicSkill);
                          slot++;
                           characters[i].addItem("staff1");
                           //adding skill in the inventory
                            if(basicSkill == 1){
                                characters[i].addSkill("Long shot");
                            }
                            else if(basicSkill == 2){
                                characters[i].addSkill("Arrow rain");
                            }
                        } 
                        else {
                          System.out.println("Invalid class choice. Please try again.");
                        }

                       
                     

                        
                        break;
                    }
                } else {
                    System.out.println("You have reached the maximum number of characters (5).");
                }
                }
                break;
            case 3:
                System.out.println("Displaying all characters:");
                for(int i = 0; i < characters.length; i++){
                    if(characters[i] != null){
                        System.out.println("_______________________________");
                        System.out.println("======Character " + (i + 1) + "=======");
                        characters[i].Display();
                        System.out.println("_______________________________");
                    }
                }
                break;  
            case 4:
                System.out.println("Exiting the game. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }


        //freedback for character creation 
         if (slot <= 5 && slot == 1){
         Thread.sleep(1000);
         System.out.println("-------------------------------");
         System.out.println("Your Character has been successfully created ");
         System.out.println("-------------------------------");
         Thread.sleep(1000);
                           
         }
       
    }while(choice != 4);
    }
}



