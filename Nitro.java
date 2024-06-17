import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nitro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nitro extends Actor
{
    /**
     * Act - do whatever the Nitro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        // change the visibility upon new leve
        if (MyWorld.started) {
            if (MyWorld.lvl >= 1) {
                getImage().setTransparency(1);
            } else {
                getImage().setTransparency(0);
            }
        }
    }
}
