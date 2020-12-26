package com.company;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",1000);
        System.out.println("서버와 접속됨.");
    }
}
