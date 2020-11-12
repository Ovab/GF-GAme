import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlobBullet extends Actor
{
    int hp= 10;
    int hit= 0;
    public int speed = 10;
     private GreenfootImage splatter;
    public BlobBullet(){
    splatter = new GreenfootImage("projectile burst.png");
}
    /**
     * Act - do whatever the CopyOfBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()   {
       setLocation(getX() + speed, getY());
               destroyEnemies();
       checkBoundaries();
}
    private SimpleTimer timer = new SimpleTimer();
      //destroy bullets that are off screen.
   public void checkBoundaries(){
       if(getX() > getWorld().getWidth() -10 || (getX() < 10)){
                       if (timer.millisElapsed() > 10){
            getWorld().removeObject(this);
                         timer.mark(); // Reset the timer 
                    }
                }
            }
   //"destroyEnemies()" destroys enemies.
   public void destroyEnemies()
   {
       //"Enemy" can be any class that you want the BlobBullet to destroy.
       Actor enemy = getOneIntersectingObject(Isaac.class);
       if(enemy != null) {
            getWorld().removeObject(enemy);
       }
   }
   
}    
