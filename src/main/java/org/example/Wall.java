package org.example;

public class Wall {

    private double width;
    private double height;
    public double result = width * height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        if (width < 0 || height < 0) {
            return 0;
        }
        return width * height;
    }


    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setHeight(double height) {
      this.height = (height < 0) ? 0 :height;
       }


}
