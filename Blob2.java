import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blob2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob2 extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the Blob2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       Actor enemy = getOneIntersectingObject(Isaac.class);
       if(enemy != null) {
            getWorld().removeObject(enemy);
             Greenfoot.stop();
             Greenfoot.playSound("BABA BOOEY.mp3");
            getWorld().removeObject(this);
       }
       if (timer.millisElapsed() > 1000){
               Blob2checkFire();
            }
    }
             public void Blob2checkFire() {
               BlobBullet2 BlobBullet2 = new BlobBullet2();
                getWorld().addObject(BlobBullet2, getX()-26, getY());
               BlobBullet2.speed=(-10);timer.mark();}
        }
