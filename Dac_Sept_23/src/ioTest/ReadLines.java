package ioTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {
    void readLines() throws IOException{
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("My name is Ashwinkumar Somkant Bhalekar");
        do{
            str = br.readLine();
            System.out.println(str);
        }
        while(!str.equals("stop"));
    }
    public static void main(String[] args) throws IOException {
        ReadLines rl = new ReadLines();
        rl.readLines();
    }
 
}

