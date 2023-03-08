package com.example.demo.singleTon;

public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        //this.socketClient = SocketClient.getInstance();
       // this.socketClient = new socketClient();

    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
