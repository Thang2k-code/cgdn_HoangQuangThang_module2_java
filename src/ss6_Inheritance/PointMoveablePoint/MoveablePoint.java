package ss6_Inheritance.PointMoveablePoint;

public class MoveablePoint extends Point {
    public float xSpeed = 0.0f;
    public float ySpeed = 0.0f;
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){};
    public float getxSpeed(){
        return xSpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    public float getySpeed(){
        return ySpeed;
    }
    public void setySpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
