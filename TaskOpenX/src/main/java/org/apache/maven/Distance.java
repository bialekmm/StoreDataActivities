package org.apache.maven;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;

public class Distance extends User{
    public void maxDistance() throws Exception {
        final ObjectMapper objectMapper = new ObjectMapper();
        List<User> users = objectMapper.readValue((URLConnectionReaderUsers.reader()), new TypeReference<>() {});

        HashMap<Integer, Double> x = new HashMap<>();
        HashMap<Integer, Double> y = new HashMap<>();
        HashMap<Integer, Integer> id = new HashMap<>();
        HashMap<Integer, String> username = new HashMap<>();

        for (int i = 0; i < users.size(); i++) {
            y.put(i, Double.parseDouble(users.get(i).getAddress().getGeolocation().getLong()));
            x.put(i, Double.parseDouble(users.get(i).getAddress().getGeolocation().getLat()));
            id.put(i, users.get(i).getId());
            username.put(i, users.get(i).getUsername());
        }
        double maxDistance = 0;
        String user1 = "";
        String user2 = "";
        for (int i = 0; i < users.size(); i++) {
            for (int j = i + 1; j < users.size(); j++) {
                double lat1 = x.get(i);
                double lon1 = y.get(i);
                double lat2 = x.get(j);
                double lon2 = y.get(j);
                double distance = distance(lat1, lon1, lat2, lon2);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    user1 = username.get(i);
                    user2 = username.get(j);
                }
            }
        }
        System.out.println("The most distant users are: " + user1 + " i " + user2);
    }
    public static double distance(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371;
        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c;
        return distance;
    }
}
