import greenfoot.*;

/**
 * Player class - represents the player's car.
 * Handles user input, speed, collision detection, and costume changes.
 */
public class Player extends Actor {
    
    // constants for sprite
    private static final int def = 13;  // default frame when not turning
    private static final int initDef = 13; // initial default frame
    private static final int thresL = 12; // left turn threshold min
    private static final int thresR = 15; // right turn threshold min
    
    // array to store sprite images
    private GreenfootImage[] sprites;
    private int current;  // index of the current sprite
    private boolean l = false;       // turning left flag
    private boolean r = false;       // turning right flag
    private boolean tweening = false;// tweening (transitioning between frames) flag
    private int center;              // center position of the sprite

    /**
     * Constructor initializes the player.
     */
    public Player() {
        // load all 53 sprites and resize them to half their original size
        sprites = new GreenfootImage[53];
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new GreenfootImage("Vehicles-Sprites/PLAYER/" + i + ".png");
            sprites[i].scale(sprites[i].getWidth() / 2, sprites[i].getHeight() / 2);
        }
        
        //set initial sprite and image properties
        current = def;
        setImage(sprites[current]);
        center = getImage().getWidth() / 2; // get the center position of the sprite
    }

    /**
     * Act method called by Greenfoot. Handles player's behavior.
     */
    public void act() {
        if (MyWorld.started) {
            handleInput(); // handle user input
            update();      // update player's appearance based on position
        }
    }

    /**
     * Handle user input to move the player and set turning flags.
     */
    private void handleInput() {
        if (Greenfoot.isKeyDown("right")) {
            if (!r) {
                current = initDef; // reset to default frame when starting a new right turn
            }
            r = true; // set turning right flag
            l = false; // clear turning left flag
            tweening = false; // clear tweening flag
            move(MyWorld.speed / 3); // move right
        } else if (Greenfoot.isKeyDown("left")) {
            if (!l) {
                current = initDef; // reset to default frame when starting a new left turn
            }
            l = true; // set turning left flag
            r = false; // clear turning right flag
            tweening = false; // clear tweening flag
            move(-MyWorld.speed / 3); // Move left
        } else {
            if (l || r) {
                l = false; // clear turning left flag
                r = false; // clear turning right flag
                tweening = true; // set tweening flag
            }
        }
    }

    /**
     * Update the player's sprite based on its X position.
     */
    private void update() {
        int distanceFromCenter = getX() - getWorld().getWidth() / 2;
        int spriteIndexDelta;
        int turnIntensity = Math.abs(distanceFromCenter) / 60; // adjust the divisor for finer control
        
        // determine the direction of the turn
        if (distanceFromCenter < 0) {
            // on the left side, increase index as it moves further left
            spriteIndexDelta = turnIntensity;
        } else {
            // on the right side, decrease index as it moves further right
            spriteIndexDelta = -turnIntensity;
        }

        current = initDef + spriteIndexDelta;

        // clamp sprite index within the range of thresL to thresR
        if (current < thresL) {
            current = thresL;
        }
        if (current > thresR) {
            current = thresR;
        }
        
        // perform tweening to transition back to initDef when tweening flag is true
        if (tweening) {
            if (current < initDef) {
                current++;
            } else if (current > initDef) {
                current--;
            } else {
                tweening = false; // tweening complete
            }
        }

        // set the image to the current sprite
        setImage(sprites[current]);
    }
}
