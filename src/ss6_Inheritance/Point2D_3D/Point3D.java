package ss6_Inheritance.Point2D_3D;

import ss6_Inheritance.Point2D_3D.Point2D;

public class  Point3D extends Point2D {
    private float z=0.0f;
    private float x;

    public Point3D(float x,float y,float z){
        super(x, y);
        this.z=z;
    }
    public Point3D(){
        this(0.0f,0.0f,0.0f);
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public void setXYZ(float x,float y,float z){
        setXY(x, y);
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{x, y, z};
    }
    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }
}
