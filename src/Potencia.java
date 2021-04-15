
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cesar
 */
public class Potencia {
    
    public static void main (String args[]){
       int x=Integer.parseInt(showInputDialog("Ingrese un numero"));
       int y=Integer.parseInt(showInputDialog("Ingrese la potencia"));
       showMessageDialog(null,funcionp(x,y));
    }    
    
    public static int funcionp(int x, int y) {
        if (y == 0) {
            return 1;
        }else {
           return x * funcionp(x, y - 1);
        }
    } 

}
