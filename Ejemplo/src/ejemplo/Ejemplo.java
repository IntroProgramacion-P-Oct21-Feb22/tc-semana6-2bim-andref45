/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import org.apache.commons.lang3.RandomUtils;
/**
 *
 * @author reroes
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        obtenerN();
    }

    public static void obtenerN() {
        int[] a = new int[10];
        for (int i=0; i<a.length; i++){
            a[i] = RandomUtils.nextInt(100,110);
        }
        for (int i=0; i<a.length; i++){
            System.out.printf("El valor de a[%d] es %d\n", i, a[i]);
        }
    }
}
