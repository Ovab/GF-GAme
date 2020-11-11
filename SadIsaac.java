import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SadIsaac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SadIsaac extends Actor
{
    
    public int getRandomNumber(int start,int end)
{
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
}


    int mov;
    /**
     * Act - do whatever the SadIsaac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
                if(foundRock()) {
            move(-15);
        }
 move(4);
        if (getWorld().getObjects(Isaac.class).isEmpty()) return; // skips following if the Isaac is not in world
        Actor Isaac = (Actor)getWorld().getObjects(Isaac.class).get(0); // gets reference to Isaac
        turnTowards(Isaac.getX(), Isaac.getY()); // turn toward Isaac
        

               Actor enemy = getOneIntersectingObject(Isaac.class);
       if(enemy != null) {
            getWorld().removeObject(enemy);
             Greenfoot.stop();
             Greenfoot.playSound("BABA BOOEY.mp3");
            getWorld().removeObject(this);
       }
}

    protected boolean foundRock() {
            Actor rock;
            rock = getOneObjectAtOffset(0, 0, Rock.class);
            if(rock != null) {
                   return true;
            }
            return false;
        }
}