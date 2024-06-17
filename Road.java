import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends Actor
{
    /**
     * Act - do whatever the Road wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image;
    
    public Road() {
        image = new GreenfootImage("Road.png");
        setImage(image);
    }
    
    public void act()
    {
        if (MyWorld.started) {
            int width = getWorld().getWidth();
            int height = getWorld().getHeight();
            image.scale((int)((int)(getY()*1.425)^2), image.getHeight());
            setLocation((int)(width/2+MyWorld.offset*100+MyWorld.distance*getY()),getY());
        }
    }
}
