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
    private boolean fired;    private boolean fired2;     private boolean fired3;     private boolean fired4;
    private GreenfootImage imageDown;
    private GreenfootImage imageLeft;
        private GreenfootImage imageUp;
        private GreenfootImage imageRight;
    /**
     * Act - do whatever the Isaac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public Isaac()
{
    imageUp= new GreenfootImage("isaacUp.png");
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
     public void checkFire() {
    bullet bullet = new bullet();
    getWorld().addObject(bullet, getX()+26, getY());
    if (Greenfoot.isKeyDown("left")) {bullet.speed=(-10); bullet.turn = (0);}
    else if (Greenfoot.isKeyDown("down")) {bullet.speed=(0); bullet.turn = (-10);}
    else if (getImage().equals(imageUp));
    else bullet.setRotation(0);
}
 
    public void act() 
    {
        // Add your action code here.
            //player movement
            Move();
        //fire
            if (fired != Greenfoot.isKeyDown("right")) {
                    fired = ! fired; // record change
                        if (fired) {
                                checkFire(); 
                            }
                        }     
                                
            if (fired2 != Greenfoot.isKeyDown("left")) {
                    fired2 =! fired2; // record change
                        if (fired2) {
                                checkFire(); 
                            }
                        } 
        
            if (fired3 != Greenfoot.isKeyDown("down")) {
                    fired3 = ! fired3; // record change
                        if (fired3) {
                                checkFire(); 
                            }
                        } 
        
            if (fired4 != Greenfoot.isKeyDown("up")) {
                    fired4 = ! fired4; // record change
                        if (fired4) {
                                checkFire(); 
                            }
                        } 
        
    }
private void Move() {
                if (Greenfoot.isKeyDown("d")) {
                 if(getImage() == imageDown || (getImage() == imageLeft||(getImage() == imageUp))) {
                 setImage(imageRight);
                }
            setRotation(0);
            move (6);
    }
        if (Greenfoot.isKeyDown("s")) {
                 if(getImage() == imageLeft || (getImage() == imageRight||(getImage() == imageUp))) {
                 setImage(imageDown);
                }
                
            setImage(imageDown);
            setRotation(90);
            move (6);
}
        if (Greenfoot.isKeyDown("a")) {
                 if(getImage() == imageDown || (getImage() == imageRight ||(getImage() == imageUp))) {
                 setImage(imageLeft);
                }
           
            setRotation(180);
            move (6);
    }
            if (Greenfoot.isKeyDown("w")) {
                 if(getImage() == imageLeft || (getImage() == imageRight)) {
                 setImage(imageUp);
                }
            setImage(imageUp);
            setRotation(90);
            move (-6);
        }
    }
}