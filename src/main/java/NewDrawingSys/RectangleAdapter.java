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
public class RectangleAdapter implements Shape{
    private Rectangle adaptee;
    
    public RectangleAdapter(){
        this.adaptee = new Rectangle();
    }
    
    
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int width = Math.abs(x2-x1);
        int height = Math.abs(y1-y2);
        
        adaptee.draw(x1, y1, width , height);
    }
}
