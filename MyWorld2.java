import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
        protected void populateTheWorld()
{
    addObject(new Isaac(), 350, 250);
    addObject(new Door1(),20, 300);
    addObject(new Rock(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
}

    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    public MyWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(800, 600, 1); 
            populateTheWorld();
    }
}
