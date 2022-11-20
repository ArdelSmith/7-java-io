package com.example.task02;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        WindowsToUnix(System.in, System.out);
    }
    public static void WindowsToUnix(InputStream a, OutputStream b) throws IOException {
        int i = 0;
        int f = a.read();
        List<Integer> data = new ArrayList<Integer>();
        data.add(f);
        while (f != -1){
            f = a.read();
            if (f == 10 & data.get(i) == 13){
                data.remove(i);
                data.add(f);
            }
            else {
                data.add(f);
                i += 1;
            }
        }
        for (int e = 0; e < i; e++){
            b.write(data.get(e));
        }
        b.flush();
    }
}
