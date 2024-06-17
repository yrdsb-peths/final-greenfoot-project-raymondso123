import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Lines extends Actor
{
    /**
     * Act - do whatever the Lines wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image;
    
    public Lines() {
        image = new GreenfootImage("lines.png");
        setImage(image);
    }
    
    /* Deprecated
    public void act()
    {
        int width = getWorld().getWidth();
        int height = getWorld().getHeight();
        image.scale(image.getWidth(),width/4);
        setLocation((int)(width/2-MyWorld.offset*100+MyWorld.distance*getY()),getWorld().getWidth()/2);
    }*/
}
