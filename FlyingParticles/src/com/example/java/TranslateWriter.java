package com.example.java; /**
 * Write a description of class TranslateWriter here.
 *
 * @author (Aleksandra Kaszuba)
 * @version (CCPS2 2016)
 */
/*import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class TranslateWriter extends Writer {
    public static void main(String [] args) throws IOException {
        StringWriter sw = new StringWriter();
        TranslateWriter tw = new TranslateWriter(sw);
        tw.addRule('a', "AA");
        tw.write("abcde");
        System.out.println(sw.toString());
    }

    private Writer writer;
    //stores a map of translation rules from characters to strings
    // private Map<Character, String> mapofrules;
    private Map<Character, String> mapofrules = new HashMap<>();;
    private int count = 0;
    public TranslateWriter(Writer writer){
        this.writer = writer;
    }
    public void addRule(char c, String s){
        //add a given translation rule from c to s
        mapofrules.put(c,s);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        System.out.println("writing "  + off + ", " + len);
        for (char c : cbuf) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int i = off; i <= off + len - 1; i++) {
            // If there is a translation rule for that character stored in the map,
            // write the corresponding string of the rule.
            // Otherwise just write that same character as is.


                    if ( mapofrules.containsKey(cbuf[i])  ) {
                     // writer.write(mapofrules.get(cbuf[i]));
                    //   System.out.println("map size: " +mapofrules.size() + ", c length: " + cbuf.length);
                 // System.out.println("yes");
                    } else {
            //  System.out.println(" cbuff:" +(cbuf[i])+" map:"+(mapofrules.get(cbuf[i])) );
            writer.write(cbuf, i, 1);
            // System.out.println("no");
            //  System.out.println(" cbuff key:" +(cbuf[i])+ " map:"+(mapofrules.get(cbuf[i])) );
            //   }
        }
    }

    @Override
    public void flush() throws IOException {
        writer.flush();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }

}*/

