package week7_curriculum.class_activity_8A;

import java.net.MalformedURLException;
import java.net.URL;

public class URLdemo {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.google.com/index.html");
            System.out.println("Protocol Name: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Path: " + url.getFile());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
