package com.example.demo;

import com.example.demo.adapter.Electronic110V;
import com.example.demo.adapter.HairDryer;
import com.example.demo.singleTon.AClazz;
import com.example.demo.singleTon.BClazz;
import com.example.demo.singleTon.SocketClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

    /*
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

     */
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);
    }
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
