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
            
                    for (int i = 0; i < 4; i++) {addObject(new Blob(), x, y);
                    y+=100;
                    if (i==2){y+=100;}
                    }
                    
                    for (int r = 0; r < 4; r++) {addObject(new Blob(), x2, y2);
                    y2+=100;
                    if (r==2){y2+=100;}
                    }
                    

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
    }
}
