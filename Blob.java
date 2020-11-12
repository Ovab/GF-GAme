import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob extends Actor
{
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the Blob wants to do. This method is called whenever
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
               BlobcheckFire();
            }
    }
             public void BlobcheckFire() {
                BlobBullet BlobBullet = new BlobBullet();
                getWorld().addObject(BlobBullet, getX()+26, getY());
                BlobBullet.speed=(10);timer.mark();}
        }
