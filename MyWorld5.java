import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld5 extends World
{
        protected void populateTheWorld()
{
    addObject(new CuredIsaac(), 350, 250);
        for (int i = 0; i < 45; i++) {
            addObject(new SisterIsaac(), 900, 500);
        }
}

    /**
     * Constructor for objects of class MyWorld5.
     * 
     */
    public MyWorld5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
populateTheWorld();
    }
}
