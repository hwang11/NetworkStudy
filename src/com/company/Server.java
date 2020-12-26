package com.company;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 1000;
        String str = new String(args[0]);

        ServerSocket ssk = new ServerSocket(port);
        System.out.println("접속 대기중");

        while(true){
            Socket sock = ssk.accept();
            System.out.println("사용자 접속 했습니다");
            System.out.println("Client ip :"+ sock.getInetAddress());

            OutputStream ous = sock.getOutputStream();
            DataOutputStream dous = new DataOutputStream(ous);

            dous.writeUTF(str);
            dous.flush();
            dous.close();
            ous.close();
            sock.close();

        }



    }
}
