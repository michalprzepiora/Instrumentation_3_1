package com.kodilla;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

public class User {
    public void doSomething() throws UnknownHostException {

        System.out.printf("%s do something at %s." , getHostName(), getDateTimeNow());
    }

    private LocalDateTime getDateTimeNow(){
        return LocalDateTime.now();
    }

    private String getHostName() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostName();

    }
}
