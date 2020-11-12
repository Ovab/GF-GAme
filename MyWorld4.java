import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld4 extends World
{
    int x= 100;
    int x2= 800;
    int y= 20;
    int y2= 20;
    private SimpleTimer timer = new SimpleTimer();
    protected void populateTheWorld() {
        addObject(new Isaac(), 300, 600);
        addObject(new Door1(),400, 60);
        /*
        for (int i = 0; i < 4; i++) {addObject(new Blob(), x, y);
        y+=100;
        if (i==2){y+=100;}
        }

        for (int r = 0; r < 4; r++) {addObject(new Blob(), x2, y2);
        y2+=100;
        if (r==2){y2+=100;}
        }
         */

    }

    /**
     * Constructor for objects of class MyWorld4.
     * 
     */
    public MyWorld4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        populateTheWorld();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Blob blob = new Blob();
        addObject(blob,34,79);
        Blob blob2 = new Blob();
        addObject(blob2,28,180);
        Blob blob3 = new Blob();
        addObject(blob3,21,281);
        Blob blob4 = new Blob();
        addObject(blob4,18,479);
        Blob2 blob22 = new Blob2();
        addObject(blob22,761,466);
        Blob2 blob23 = new Blob2();
        addObject(blob23,755,272);
        Blob2 blob24 = new Blob2();
        addObject(blob24,754,170);
        Blob2 blob25 = new Blob2();
        addObject(blob25,764,66);
    }
}
