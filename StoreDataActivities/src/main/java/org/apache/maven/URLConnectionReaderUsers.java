package org.apache.maven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReaderUsers {
    public static String reader() throws Exception {
        URL users = new URL("https://fakestoreapi.com/users");
        URLConnection yc = users.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
        String inputLine;
        String data = null;
        while ((inputLine = in.readLine()) != null) {
            data = inputLine;
        }
        in.close();
        return data;
    }
}