import greenfoot.*;

/**
 * Cone class - represents a cone actor that spawns randomly and scales based on difficulty and position.
 */
public class Cone extends Actor {

    private GreenfootImage image;

    /**
     * Constructor initializes the cone with its image.
     */
    public Cone() {
        image = new GreenfootImage("cone.png");
        setImage(image);
    }

    /**
     * Act method called by Greenfoot. Handles cone's behavior.
     */
    public void act() {
        scaleImage(); // Scale the cone's image based on its position
        moveDown();   // Move the cone downwards based on game speed
    }

    /**
     * Scales the cone's image based on its Y position.
     */
    private void scaleImage() {
        int factor = (getY() + 5 / 5); // Calculate scaling factor based on Y position
        image.scale(factor, factor);  // Scale the image
    }

    /**
     * Moves the cone downwards based on the game speed.
     */
    private void moveDown() {
        setLocation(getX(), getY() + MyWorld.speed / 2); // Move downwards based on game speed
    }
}
