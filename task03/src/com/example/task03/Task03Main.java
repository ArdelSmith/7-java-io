package com.example.task03;

import java.io.*;
import java.nio.charset.Charset;

public class Task03Main {
    public static void main(String[] args) throws IOException {
        System.out.println(readAsString(new FileInputStream("task03/src/com/example/task03/input.test"), Charset.forName("KOI8-R")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        // your implementation
        if (inputStream == null | charset == null) throw new IllegalArgumentException();
        BufferedInputStream in = new BufferedInputStream(inputStream, 1024*32);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] dataBuffer = new byte[1024 * 16];
        int size = 0;
        while ((size = in.read(dataBuffer)) != -1) {
            out.write(dataBuffer, 0, size);
        }
        return new String(out.toByteArray(), charset);
    }
}
