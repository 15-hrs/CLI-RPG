import java.util.Random;

class Events{

    
//foor1
static void encounter() {

    Random rand = new Random();
    int enemy = rand.nextInt(100); 


    if (enemy >= 50) {
      System.out.println("You encountered a wild monster!");
    }  
    else if (enemy >= 30) {
            System.out.println("You found a treasure chest!");
     
    }
    else if (enemy >= 10) {
            System.out.println("You met a wandering merchant!");          
    }
} 


    
//chest logic
static void randomEvent() {
    Random rand = new Random();
    int chest = rand.nextInt(100);
    
    if (chest >= 20) {
        int weapon = rand.nextInt(3);

        switch(weapon) {
            case 0:
                System.out.println("You found a sword!");
            
                break;
            case 1:
                System.out.println("You found a bow!");
        
                break;
            case 2:
                System.out.println("You found a staff!");
               
                break;
           }
    }
}

}