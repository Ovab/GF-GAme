import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PolishCow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob extends Actor
{
    int bomb=0;
    private boolean fired;    private boolean fired2;     private boolean fired3;     private boolean fired4;
    GifImage myGif = new GifImage("poliskow.gif");
    /**
     * Act - do whatever the PolishCow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        //setImage(myGif.getCurrentImage());
        koeCheckFire();
        
    }    
     private SimpleTimer timer = new SimpleTimer();
    public void notspam() {
            if (fired != Greenfoot.isKeyDown("right")) {fired = ! fired;if (fired) {koeCheckFire(); }}     
                                
            if (fired2 != Greenfoot.isKeyDown("left")) {fired2 =! fired2;if (fired2) {koeCheckFire(); }} 
        
            if (fired3 != Greenfoot.isKeyDown("down")) {fired3 = ! fired3;if (fired3) {koeCheckFire(); }} 
        
            if (fired4 != Greenfoot.isKeyDown("up")) {fired4 = ! fired4;if (fired4) {Greenfoot.playSound("Fart.mp3"); bomb+=5;}} 
    }
    
    protected boolean foundRock() {
            Actor rock;
            rock = getOneObjectAtOffset(0, 0, Rock.class);
            if(rock != null) {
                   return true;
            }
            return false;
        }

     public void koeCheckFire() {
         bullet bullet = new bullet();
         getWorld().addObject(bullet, getX()+26, getY());
            if (Greenfoot.isKeyDown("right")&&timer.millisElapsed() > 5000) {bullet.speed=(10); bullet.turn = (0); bomb=0;}
        }
}
