/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.blits.random1;
import java.io.*;

/**
 *
 * @author Digo Pratama <pratamawocky@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0;
        try {
            File file=new File("/home/digop/Random.txt");
            FileWriter filewriter=new FileWriter(file);
            BufferedWriter writer=new BufferedWriter(filewriter);
            for(int i=0;i<2000000;i++) {
                x=(int)(Math.random()*2000000);
                writer.write(" "+x);
            }
            writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        try {
            File file1=new File("/home/digop/Random.txt");
            FileReader filereader=new FileReader(file1);
            BufferedReader reader=new BufferedReader(filereader);
            String y;
            while((y=reader.readLine())!=null) {
                System.out.println(y);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
