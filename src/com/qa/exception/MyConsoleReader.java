package com.qa.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyConsoleReader {
    public void readInputPrint() throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            String line = br.readLine();

            while (!line.equals("stop")) {
                stringBuffer.append(line + "\n");
                System.out.println("Enter a line of text or 'stop': ");
                line = br.readLine();
            }
            System.out.println(stringBuffer);
        } catch (IOException io) {
            System.out.println("Error on console input: " + io);
            io.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {
        MyConsoleReader myConsoleReader = new MyConsoleReader();
        myConsoleReader.readInputPrint();
    }
}
