package hus.oop.lab5._1_3;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this.z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] { super.getX(), super.getY(), z };
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}
