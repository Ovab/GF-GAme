import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Isaac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Isaac extends Actor
{
    int hp=3;
    private GreenfootImage imageDown;
    private GreenfootImage imageLeft;
        private GreenfootImage imageRight;
    /**
     * Act - do whatever the Isaac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public Isaac()
{
    imageLeft= new GreenfootImage("isaacleft.png");
    imageRight= new GreenfootImage("isaacright.png");
    imageDown= new GreenfootImage("isaacdwn.png");
}

protected void KillIsaac() {
 Actor Isaac;
 Isaac = getOneObjectAtOffset(0, 0, Isaac.class);
 Greenfoot.playSound("scream.mp3");
 getWorld().removeObject(Isaac);
 Greenfoot.stop();
 }
     public void checkFire()
    {
       getWorld().addObject(new Bullet(), getX()+50, getY());
       //Greenfoot.delay(30);
}
 
    public void act() 
    {
        // Add your action code here.
            //player movement
            if (Greenfoot.isKeyDown("d")) {
                 if(getImage() == imageDown || (getImage() == imageLeft)) {
                 setImage(imageRight);
                }
            setRotation(0);
            move (5);
    }
        if (Greenfoot.isKeyDown("s")) {
                 if(getImage() == imageLeft || (getImage() == imageRight)) {
                 setImage(imageDown);
                }
                
            setImage(imageDown);
            setRotation(90);
            move (6);
}
        if (Greenfoot.isKeyDown("a")) {
                 if(getImage() == imageDown || (getImage() == imageRight)) {
                 setImage(imageLeft);
                }
           
            setRotation(180);
            move (6);
    }
            if (Greenfoot.isKeyDown("w")) {
                 if(getImage() == imageLeft || (getImage() == imageRight)) {
                 setImage(imageDown);
                }
            setImage(imageDown);
            setRotation(90);
            move (-6);
        }
        //fire
                if (Greenfoot.isKeyDown("right")) {
                 checkFire();
                 try {
                 Thread.sleep(100);
                }
                catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
        }
        
    }
}