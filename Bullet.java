import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    int hp= 10;
    int hit= 0;
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()
   {
                     //setRotation(Isaac.getRotation());
       setLocation(getX() + speed, getY());
       checkBoundaries();
       destroyEnemies();
   }
   //we add a method "checkBoundaries()" that destroys bullets that are off screen.
   public void checkBoundaries()
   {
       if(getX() > getWorld().getWidth() - 1) 
            getWorld().removeObject(this);
       else if(getX() < 1) 
            getWorld().removeObject(this);
       if(getY() > getWorld().getHeight() - 1) 
            getWorld().removeObject(this);
       else if(getY() < 1) 
            getWorld().removeObject(this);
   }
   //"destroyEnemies()" destroys enemies.
   public void destroyEnemies()
   {
       //"Enemy" can be any class that you want the bullet to destroy.
       Actor enemy = getOneIntersectingObject(SadIsaac.class);
       if(enemy != null) {
           hp-=1;
            System.out.println(hp);
            //getWorld().removeObject(enemy);
            getWorld().removeObject(this);
       }
       if(hp==0){
          getWorld().removeObject(enemy);
        }
   }
 
   private int speed = 10;
}    
