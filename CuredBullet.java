import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuredBullet extends Actor
{
    int hp= 10;
    int hit= 0;
    public int speed = 10;
    public int turn = 0;
     private GreenfootImage splatter;
    public CuredBullet(){
    splatter = new GreenfootImage("projectile burst.png");
}
    /**
     * Act - do whatever the CopyOfBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()   {
       setLocation(getX() + speed + turn, getY());
               destroyEnemies();
       //checkBoundaries();
}
    private SimpleTimer timer = new SimpleTimer();
      //destroy bullets that are off screen.
   public void checkBoundaries(){
       if(getX() > getWorld().getWidth() -10 || (getX() < 10)){
                       if (timer.millisElapsed() > 10){
     // Code here for firing a new shot
      setImage(splatter);
                         timer.mark(); // Reset the timer 
                    }
                }
            }
   //"destroyEnemies()" destroys enemies.
   public void destroyEnemies()
   {
       //"Enemy" can be any class that you want the bullet to destroy.
       Actor enemy = getOneIntersectingObject(SisterIsaac.class);
       if(enemy != null) {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
       }
       
   }
   public void destroyKoe(){
                 Actor enemy3 = getOneIntersectingObject(PolishCow.class);
       if(enemy3 != null) {
            getWorld().removeObject(enemy3);
            getWorld().removeObject(this);
       }
    }
       
      public void destroyBlob(){
                 Actor enemy2 = getOneIntersectingObject(Blob.class);
       if(enemy2 != null) {
            getWorld().removeObject(enemy2);
            getWorld().removeObject(this);
       }    
    }
   
}    
