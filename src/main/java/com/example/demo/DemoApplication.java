package com.example.demo;

import com.example.demo.adapter.*;
import com.example.demo.aop.AopBrowser;
import com.example.demo.proxy.Browser;
import com.example.demo.proxy.BrowserProxy;
import com.example.demo.proxy.IBrowser;
import com.example.demo.singleTon.AClazz;
import com.example.demo.singleTon.BClazz;
import com.example.demo.singleTon.SocketClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

    /*
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();


        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);

        connect(adapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);



        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();



        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
    */
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }

        );

        aopBrowser.show();
        System.out.println("loading time :"+ end.get());

        aopBrowser.show();
        System.out.println("loadung time :"+ end.get());

    }
}
