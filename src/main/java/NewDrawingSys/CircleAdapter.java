/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewDrawingSys;

/**
 *
 * @author soblab
 */
public class CircleAdapter implements Shape {

    private Circle adaptee;

    public CircleAdapter() {
        this.adaptee = new Circle();
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int centerX = Math.abs(x2 - x1);
        int centerY = Math.abs(y1 - y2);
        int radius = centerY;
        this.adaptee = new Circle();
        adaptee.draw(centerX, centerY, radius);
    }

}
