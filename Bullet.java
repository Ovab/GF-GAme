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
<<<<<<< HEAD
     private GreenfootImage splatter;
          private GreenfootImage trans;
    public bullet(){
    trans = new GreenfootImage("1x1.png");
=======
    private GreenfootImage splatter;
    public bullet(){
>>>>>>> 899df1c67bf634b8f821dff8fb13aaa49995309d
    splatter = new GreenfootImage("projectile burst.png");
}
    /**
     * Act - do whatever the CopyOfBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()   {

                     //setRotation(Isaac.getRotation());
       setLocation(getX() + speed + turn, getY());
       checkBoundaries();
       if(foundRock()) {
<<<<<<< HEAD
           speed=0;
            if (timer.millisElapsed() > 10){
=======
            if (timer.millisElapsed() > 100 && Greenfoot.isKeyDown("space")){
>>>>>>> 899df1c67bf634b8f821dff8fb13aaa49995309d
     // Code here for firing a new shot
      setImage(splatter);
                         timer.mark(); // Reset the timer 
                        }
                    }
                       destroyEnemies();
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
