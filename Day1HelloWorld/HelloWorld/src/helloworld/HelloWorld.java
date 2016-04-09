/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Jamie
 */
public class HelloWorld {

    
    public int timesTwo(int x, int y) {
        return x + y;
    }
            
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        HelloWorld bam = new HelloWorld();
        System.out.println(bam.timesTwo(one, two));
    }
    
}
