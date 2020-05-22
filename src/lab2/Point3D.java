package lab2;


public class Point3D  extends Point2D{
    private double zCoord; // координата z

    public Point3D(double x, double y, double z) {  //Конструктор инициализации
        setX(x);
        setY(y);
        setZ(z);
    }

    public Point3D(double Coord) {
        setX(Coord);
        setY(Coord);
        setZ(Coord);
    }

    public Point3D() { //Конструктор по умолчанию .
        this(0, 0, 0);
    }


    public double getZ() { // возвращение координаты z
        return zCoord;
    }


    public void setZ(double val) { //Установка значения координаты Z
        zCoord = val;
    }


    public boolean equalsTo(Point3D m) {
        return (xCoord==m.xCoord & yCoord==m.yCoord & zCoord==m.zCoord);
    }

    public static double distanceTo(Point3D m, Point3D n) {
        return Math.sqrt(Math.pow((m.xCoord - n.xCoord), 2) + Math.pow((m.yCoord - n.yCoord), 2) + Math.pow((m.zCoord - n.zCoord), 2));
    }

    public static double computeArea(Point3D m, Point3D n, Point3D o) {
        double a = distanceTo(m, n);
        double b = distanceTo(n, o);
        double c = distanceTo(o, m);
        double p = (a + b + c) / 2;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}