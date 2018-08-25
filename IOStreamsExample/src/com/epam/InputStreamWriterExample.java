package com.epam;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class InputStreamWriterExample {
    public static void main(String[] argv) throws Exception {
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("outfilename"), "UTF8"));
        out.write("asdf");
        out.close();
    }
}

