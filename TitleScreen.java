import greenfoot.*;

public class TitleScreen extends World {
    // sounds
    GreenfootSound intro = new GreenfootSound("Suspense.mp3");
    GreenfootSound next = new GreenfootSound("Next.mp3");
    GreenfootSound engine = new GreenfootSound("Engine.mp3");
    GreenfootSound spin = new GreenfootSound("Runoff.mp3");
    GreenfootSound win = new GreenfootSound("Victory.mp3");
    GreenfootSound lose = new GreenfootSound("Defeat.mp3");
    GreenfootSound main = new GreenfootSound("Theme.mp3");
    
    public TitleScreen() {
        super(600, 400, 1);
        next.play();
        main.play();
        main.playLoop();
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            MyWorld.started = true;
            Greenfoot.setWorld(new MyWorld());
            MyWorld.started = true;
        }
    }
}
