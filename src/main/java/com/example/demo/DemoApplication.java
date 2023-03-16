package com.example.demo;

import com.example.demo.adapter.*;
import com.example.demo.aop.AopBrowser;
import com.example.demo.decorator.*;
import com.example.demo.facade.Ftp;
import com.example.demo.facade.Reader;
import com.example.demo.facade.SftpClient;
import com.example.demo.facade.Writer;
import com.example.demo.observer.Button;
import com.example.demo.observer.IButtonListener;
import com.example.demo.proxy.Browser;
import com.example.demo.proxy.BrowserProxy;
import com.example.demo.proxy.IBrowser;
import com.example.demo.singleTon.AClazz;
import com.example.demo.singleTon.BClazz;
import com.example.demo.singleTon.SocketClient;
import com.example.demo.strategy.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        Button button = new Button("버튼");
//        button.addListener(new IButtonListener() {
//            @Override
//            public void clickEvent(String event) {
//                System.out.println(event);
//            }
//        });
//
//        button.click("메시지 전달:click 1");
//        button.click("메시지 전달:click 2");
//        button.click("메시지 전달:click 3");
//        button.click("메시지 전달:click 4");


//        Ftp ftpClient = new Ftp("www.foo.co.kr",22,"/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disConnect();
//
//        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22,"home/etc","text.tmp");
//        sftpClient.connect();
//        sftpClient.writer();
//        sftpClient.read();
//        sftpClient.disConnect();

        Encoder encoder = new Encoder();

        EncodingStrategy base64 = new Base64Strategy();

        EncodingStrategy normal = new NormalStrategy();

        String message = "hello java";
        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);



    }
}
