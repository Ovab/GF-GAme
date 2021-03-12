import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
                     private SimpleTimer timer = new SimpleTimer();
    GreenfootSound backgroundMusic = new GreenfootSound("Rippin.mp3");
    protected void populateTheWorld()
    {
        addObject(new BossIsaac(), 350, 250);
        addObject(new SadIsaacLast(), 1000, 500);
        for (int i = 0; i < 100; i++) {
            addObject(new SadIsaac(), 1000, 500);
        }
                     if (timer.millisElapsed() > 1000){
                                
        }
    }

    public void stopped(){backgroundMusic.pause();}

    //public void started(){backgroundMusic.playLoop();}

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world
        super(1200, 800, 1);
        populateTheWorld();
        started();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Deaur2 deaur2 = new Deaur2();
        addObject(deaur2,616,103);
    }
}
