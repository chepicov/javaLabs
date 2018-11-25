package com.company;

import java.io.*;
import java.net.*;
import java.util.concurrent.ThreadLocalRandom;


public class server {
    public static void main(String[] arg) {
        ServerSocket serverSocket = null;
        Socket clientAccepted     = null;
        ObjectInputStream sois   = null;
        ObjectOutputStream soos   = null;
        try {
            System.out.println("server starting....");
            serverSocket = new ServerSocket(2525);
            clientAccepted = serverSocket.accept();
            System.out.println("connection established....");
            soos = new ObjectOutputStream(clientAccepted.getOutputStream());
            sois = new ObjectInputStream(clientAccepted.getInputStream());
            String clientMessageRecieved = (String)sois.readObject();
            while(!clientMessageRecieved.equals("quite")) {
                System.out.println("message recieved: '"+clientMessageRecieved+"'");
                int n = 0;
                try {
                    n = Integer.parseInt(clientMessageRecieved);
                } catch(Exception e) {
                    soos.writeObject("Input number");
                }
                int array[][] = new int[n][n];
                int mainD = 0;
                int pobD = 0;
                for (int i = 0; i < n; i += 1) {
                    String out = "";
                    for (int j = 0; j < n; j += 1) {
                        array[i][j] = ThreadLocalRandom.current().nextInt(0, 100);
                        out += array[i][j] + " ";
                        if (i == j) {
                            mainD += array[i][j];
                        }
                        if (i + j == n + 1) {
                            pobD += array[i][j];
                        }
                    }
                    System.out.println(out);
                }
                soos.writeObject(mainD / n + " " + pobD / n);
                clientMessageRecieved = (String)sois.readObject();
            }
        }
        catch(Exception e) {
        }
        finally {
            try {
                sois.close();
                soos.close();
                clientAccepted.close();
                serverSocket.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
