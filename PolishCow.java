import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PolishCow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PolishCow extends Actor
{
    int bomb=0;
    private boolean fired;    private boolean fired2;     private boolean fired3;     private boolean fired4;
    GifImage myGif = new GifImage("poliskow.gif");
    /**
     * Act - do whatever the PolishCow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {           koeCheckFire();
        setImage(myGif.getCurrentImage());
    }    
     private SimpleTimer timer = new SimpleTimer();
    
    protected boolean foundRock() {
            Actor rock;
            rock = getOneObjectAtOffset(0, 0, Rock.class);
            if(rock != null) {
                   return true;
            }
            return false;
        }

     public void koeCheckFire() {
         bomb++;
        KoeBullet Bullet = new KoeBullet();
         KoeBullet KoeBullet = new KoeBullet();
         if (timer.millisElapsed() > getRandomNumber(500, 2000)){
                      Bullet.speed=(10);
         getWorld().addObject(Bullet, getX()+26, getY());
        }
         if (timer.millisElapsed() > getRandomNumber(500, 2000)){
         KoeBullet.speed=(-10);
         getWorld().addObject(KoeBullet, getX()-26, getY());
         timer.mark();
        }
    }
    public int getRandomNumber(int start,int end)
{
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
}
        }
