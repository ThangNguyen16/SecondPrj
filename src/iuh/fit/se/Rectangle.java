/*
 * @ (#) Rectangle.java       1.0     8/27/2024
 *
 * Copuright (c) 2024 IUH, All rights reserved
 */
 
package iuh.fit.se;

/*
 *@description: 
 *@author: Thang Nguyen 
 *@Date: 8/27/2024
 *version:  1.0
 */
public class Rectangle {
    private double length;
    private double width;


    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }


    // Constructor có tham số
    public Rectangle(double length, double width){
        if(length < 0.0 || width < 0.0){
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }



    public double getArea(){
        return length * width;
    }


    public double getPrimeter(){
        return (length + width) * 2;
    }


    public void setLength(double length){
        if(length < 0.0){
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }


    public double getLength(){
        return length;
    }


    public void setWidth(double width){
        if(width < 0.0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    public double getWidth(){
        return width;
    }


    @Override
    public String toString(){
        return "Rectangle[length = " + length + ", width = " + width + ",area = " + getArea() + ", perimeter = " + getPrimeter() + "]";
    }
}
