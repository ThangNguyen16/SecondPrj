/*
 * @ (#) TestRectangle.java       1.0     8/27/2024
 *
 * Copuright (c) 2024 IUH, All rights reserved
 */

package iuh.fit.se;


import java.util.Scanner;

/*
 *@description:
 *@author: Thang Nguyen
 *@Date: 8/27/2024
 *version:  1.0
 */
public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();


        Rectangle rc = new Rectangle(length, width);


        System.out.println("Area =  "+rc.getArea());
        System.out.println("Perimeter = " + rc.getPrimeter());


        System.out.println(rc);


        scanner.close();

    }
}
