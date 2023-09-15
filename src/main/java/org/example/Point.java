package org.example;

public class Point {
    double X, Y;

    Point(double X, double Y) {
        this.X = X;
        this.Y = Y;

    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(double X) {
        this.X = X;
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    public void setPoint(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public void shiftX(double shiftx) {
        X = (X + shiftx);
    }

    public void shiftY(double shifty) {
        Y = (Y + shifty);
    }

    public double distance(Point p2) {
        double zetaX = p2.X - this.X;
        double zetaY = p2.Y - this.Y;
        return Math.sqrt(zetaX * zetaX + zetaY * zetaY);
    }

    public void rotate(double theta) {
        double x1 = X;
        double y1 = Y;

        this.X = x1 * Math.cos(theta) - y1 * Math.sin(theta);
        this.Y = y1 * Math.cos(theta) - x1 * Math.sin(theta);


    }


}
