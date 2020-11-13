import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends World
{

    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    public MyWorld3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new PolishCow(), 350, 250);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Isaac isaac = new Isaac();
        addObject(isaac,377,496);
        Deur deur = new Deur();
        addObject(deur,425,31);
        PolishCow polishCow = new PolishCow();
        addObject(polishCow,312,379);
        PolishCow polishCow2 = new PolishCow();
        addObject(polishCow2,337,126);
    }
}
