package lab2;

public class Point2D {
    protected double xCoord; // координата X
    protected double yCoord;// координата Y

    public Point2D(double x, double y) {  //Конструктор инициализации
        xCoord = x;
        yCoord = y;
    }

    public Point2D() { //Конструктор по умолчанию .
        this(0, 0);
    }

    public double getX() { //Возвращение координаты x
        return xCoord;
    }

    public double getY() { //Возвращение координаты Y
        return yCoord;
    }

    public void setX(double val) { //Установка значения координаты X
        xCoord = val;
    }

    public void setY(double val) { //Установка значения координаты Y
        yCoord = val;
    }

    public static void main(String[] args) {
        Point2D myPoint = new Point2D();//создает точку (0,0)
        Point2D myOtherPoint = new Point2D(5, 3);//создает точку (5,3)
        Point2D aThirdPoint = new Point2D();

    }
}