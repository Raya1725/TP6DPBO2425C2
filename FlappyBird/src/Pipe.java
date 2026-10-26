import java.awt.*;

public class Pipe {
    private int posX;
    private int posY;
    private int width;
    private int height;
    private Image image;
    private int velocityX;
    boolean passed;

    public Pipe(){}

    public Pipe(int posX, int posY, int width, int height, Image image){
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.image = image;
        this.velocityX = 0;
        this.passed = false;
    }

    public int getPosX(){
        return this.posX;
    }
    public void setPosX(int posX){
        this.posX = posX;
    }
    public int getPosY(){
        return this.posY;
    }
    public void setPosY(int posY){
        this.posY = posY;
    }
    public int getWidth(){
        return this.width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return this.height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public Image getImage(){
        return this.image;
    }
    public void setImage(Image image){
        this.image = image;
    }
    public int getVelocityX(){
        return this.velocityX;
    }
    public void setVelocityX(int velocityX){
        this.velocityX = velocityX;
    }
    public boolean getPassed(){
        return this.passed;
    }
    public void setPassed(boolean passed){
        this.passed = passed;
    }
}
