import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossIsaac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossIsaac extends Actor
{
    int hp=3;
    int bomb=0;
    private boolean fired;    private boolean fired2;     private boolean fired3;     private boolean fired4;
    private GreenfootImage imageDown;
    private GreenfootImage imageLeft;
        private GreenfootImage imageUp; 
        private GreenfootImage imageRight;
             private SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the BossIsaac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public BossIsaac()
{
    imageUp= new GreenfootImage("isaacUp.png");
    imageLeft= new GreenfootImage("isaacleft.png");
    imageRight= new GreenfootImage("isaacright.png");
    imageDown= new GreenfootImage("isaacdwn.png");
             if (timer.millisElapsed() > 10000){
                 new Deaur2();
        }
}

public void changeworld() {
    //boss room
             if (isTouching(Deur.class)) {
                Greenfoot.setWorld(new MyWorld());
            }
            //normal room
             if (isTouching(Door1.class)) {
                Greenfoot.setWorld(new MyWorld3());
            }
                         if (isTouching(Door2.class)) {
                Greenfoot.setWorld(new MyWorld4());
            }
                                     if (isTouching(Deaur2.class)) {
                Greenfoot.setWorld(new MyWorld5());
            }
}

 
    public void act() 
    {
        changeworld();
        notspam();
        Move();
        if(foundRock()) {
            move(-15);
        }

    }
    public void notspam() {
            if (fired != Greenfoot.isKeyDown("right")) {fired = ! fired;if (fired) {checkFire(); }}     
                                
            if (fired2 != Greenfoot.isKeyDown("left")) {fired2 =! fired2;if (fired2) {checkFire(); }} 
        
            if (fired3 != Greenfoot.isKeyDown("down")) {fired3 = ! fired3;if (fired3) {checkFire(); }} 
        
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

         private void checkFire() {
         bomb++;
         Bossbullet bullet = new Bossbullet();
         
         getWorld().addObject(bullet, getX()+26, getY());
         if (Greenfoot.isKeyDown("left")) {bullet.speed=(-10); bullet.turn = (0);}
            else if (Greenfoot.isKeyDown("down") && (timer.millisElapsed() > 500)) {bullet.speed=(0); bullet.turn = (0); bomb=0;timer.mark();}
                else if (Greenfoot.isKeyDown("right")) { bullet.setRotation(0); bullet.speed=(10); bullet.turn = (0);}
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
