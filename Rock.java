import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the Blob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }
             public void BlobcheckFire() {
         BlobBullet BlobBullet = new BlobBullet();
         getWorld().addObject(BlobBullet, getX()+26, getY());
            if (timer.millisElapsed() > 5) {BlobBullet.speed=(10);timer.mark();}
        }
}
