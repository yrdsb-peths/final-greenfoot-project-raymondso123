import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story2 extends World
{
    SimpleTimer timer = new SimpleTimer();
    
    // sounds
    GreenfootSound intro = new GreenfootSound("Suspense.mp3");
    GreenfootSound next = new GreenfootSound("Next.mp3");
    GreenfootSound engine = new GreenfootSound("Engine.mp3");
    GreenfootSound spin = new GreenfootSound("Runoff.mp3");
    GreenfootSound win = new GreenfootSound("Victory.mp3");
    GreenfootSound lose = new GreenfootSound("Defeat.mp3");
    
    public Story2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        timer.mark();
        next.play();
    }
    
    public void act() {
        if (!MyWorld.started) {
            if (timer.millisElapsed()>5000) {
                Greenfoot.setWorld(new TitleScreen());
            }
        }
    }
}
