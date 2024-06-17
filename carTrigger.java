import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carTrigger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carTrigger extends Actor
{
    /**
     * Act - do whatever the carTrigger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (MyWorld.started) { 
            handleInput();
             
            if (!this.isTouching(Road.class)) {
                 if (MyWorld.speed>2) {
                     MyWorld.speed--;
                 }
            } else {
                 if (MyWorld.speed<10) {
                     MyWorld.speed++;
                 }
            }
        }
    }
    
    private void handleInput() {
        if (Greenfoot.isKeyDown("right")) {
            move((int)(MyWorld.speed)/3);
        } else if (Greenfoot.isKeyDown("left")) {
            move((int)(-MyWorld.speed)/3);
        }
    }
}
