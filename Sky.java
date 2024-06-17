import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky extends Actor
{
    /**
     * Act - do whatever the Sky wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int width = getWorld().getWidth();
        int height = getWorld().getHeight();
        setLocation((int)(width/2-MyWorld.offset*100+MyWorld.distance*getY()),getY());
    }
}
