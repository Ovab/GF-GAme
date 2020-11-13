import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SadIsaac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SisterIsaac extends Actor
{
    
    public int getRandomNumber(int start,int end){
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
 move(4);
        SisterCheckFire();
        if (getWorld().getObjects(CuredIsaac.class).isEmpty()) return; // skips following if the Isaac is not in world
        Actor Isaac = (Actor)getWorld().getObjects(CuredIsaac.class).get(0); // gets reference to Isaac
        turnTowards(Isaac.getX(), Isaac.getY()); // turn toward Isaac
        

               Actor enemy = getOneIntersectingObject(CuredIsaac.class);
       if(enemy != null) {
            getWorld().removeObject(enemy);
             Greenfoot.stop();
             Greenfoot.playSound("BABA BOOEY.mp3");
            getWorld().removeObject(this);
       }
}
     private SimpleTimer timer = new SimpleTimer();
     public void SisterCheckFire() {
        SisterBullet Bullet = new SisterBullet();
         SisterBullet SisterBullet = new SisterBullet();
         if (timer.millisElapsed() > getRandomNumber(1000, 2000)){
                      SisterBullet.speed=(10);
         getWorld().addObject(SisterBullet, getX()+26, getY());
        }
         if (timer.millisElapsed() > getRandomNumber(1000, 2000)){
         SisterBullet.speed=(-10);
         getWorld().addObject(SisterBullet, getX()-26, getY());
         timer.mark();
        }
    }
}