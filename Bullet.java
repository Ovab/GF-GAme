import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    int hp= 10;
    int hit= 0;
    public int speed = 10;
    public int turn = 0;
    splatter = new GreenfootImage("projectile burst.png");
    /**
     * Act - do whatever the CopyOfBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()
   {
                     //setRotation(Isaac.getRotation());
       setLocation(getX() + speed + turn, getY());
       //checkBoundaries();
       destroyEnemies();
       if(foundRock()) {
           setImage(gifImage.getCurrentImage());
            if (timer.millisElapsed() > 100 && Greenfoot.isKeyDown("space")){
     // Code here for firing a new shot
      setImage(splatter);
                     getWorld().removeObject(this);

     timer.mark(); // Reset the timer
 }
        }
   }
    private SimpleTimer timer = new SimpleTimer();
      //destroy bullets that are off screen.
   public void checkBoundaries()
   {
       if(getX() > getWorld().getWidth() -30) 
            getWorld().removeObject(this);
       if(getY() > getWorld().getHeight() - 1) 
            getWorld().removeObject(this);
   }
   
   
   //"destroyEnemies()" destroys enemies.
   public void destroyEnemies()
   {
       //"Enemy" can be any class that you want the bullet to destroy.
       Actor enemy = getOneIntersectingObject(SadIsaac.class);
       if(enemy != null) {
            getWorld().removeObject(enemy);
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
