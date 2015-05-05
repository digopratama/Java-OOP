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
public class TesAgent {
    private float pointTesAgent;
    
    void isiPoinTesAgent(double pointplus){
        pointTesAgent += pointplus;
    }
    
    float tampilTesPoint(){
        return pointTesAgent;
    }
}
