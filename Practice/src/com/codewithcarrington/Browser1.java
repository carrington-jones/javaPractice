package com.codewithcarrington;

public class Browser1 {

    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) { //Runs but can only call the navigate class this method is private
        return "<html><html>";
    }

    private String findIpAddress(String address) { //Runs but can only call the navigate class this method is private
        return "127.0.0.1";
    }
}
