import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PolishCow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PolishCow extends Actor
{
    GifImage myGif = new GifImage("poliskow.gif");
    /**
     * Act - do whatever the PolishCow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setImage(myGif.getCurrentImage());
    }    
}