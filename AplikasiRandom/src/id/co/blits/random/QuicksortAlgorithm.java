/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.random;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class QuicksortAlgorithm {
    ArrayList<AffineTransform> affs;
    ListIterator<AffineTransform> li;
    Integer count, count2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new QuicksortAlgorithm();
    }
    public QuicksortAlgorithm(){
        count = new Integer(0);
        count2 = new Integer(1);
        affs = new ArrayList<AffineTransform>();
        for (int i = 0; i <= 128; i++){
            affs.add(new AffineTransform(1, 0, 0, 1, new Random().nextInt(1024), 0));
        }
        affs = arrangeNumbers(affs);
        printNumbers();
    }
    public ArrayList<AffineTransform> arrangeNumbers(ArrayList<AffineTransform> list){
        while (list.size() > 1 && count != list.size() - 1){
            if (list.get(count2).getTranslateX() > list.get(count).getTranslateX()){
                list.add(count, list.get(count2));
                list.remove(count2 + 1);
            }
            if (count2 == list.size() - 1){
                count++;
                count2 = count + 1;
            }
            else{
            count2++;
            }
        }
        return list;
    }
    public void printNumbers(){
        li = affs.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
    }
    
}
