/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.enkapsulasi;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class Agent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TesAgent paradisotour = new TesAgent();
        paradisotour.isiPoinTesAgent(75);
        System.out.println("Poin Reward "+paradisotour.tampilTesPoint()+" Point");
    }
    
}
