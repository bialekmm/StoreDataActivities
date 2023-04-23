package org.apache.maven;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class MaxCartValue {
    public void maxCartValue() throws Exception {
        final ObjectMapper objectMapper = new ObjectMapper();
        List<ProductItem> productItems = objectMapper.readValue((URLConnectionReaderProducts.reader()), new TypeReference<>(){});
        List<User> users = objectMapper.readValue((URLConnectionReaderUsers.reader()), new TypeReference<>() {});

        String jsonString = URLConnectionReaderCarts.reader();
        JSONArray jsonArray = new JSONArray(jsonString);
        double maxValue = 0;
        int maxValueUserId = 0;

        for(int i=0; i<jsonArray.length(); i++){
            double totalValue = 0;
            JSONObject order = jsonArray.getJSONObject(i);
            int id = order.getInt("id");
            int userId = order.getInt("userId");
            String date = order.getString("date");
            JSONArray products = order.getJSONArray("products");
            for(int j=0; j<products.length(); j++){
                JSONObject product = products.getJSONObject(j);
                int productId = product.getInt("productId");
                int quantity = product.getInt("quantity");
                double value = 0;
                value = productItems.get(productId-1).getPrice()*quantity;
                totalValue += value;
            }
            if(totalValue>maxValue){
                maxValue = totalValue;
                maxValueUserId = userId;
            }
        }
        System.out.println("Highest value of cart is: " + maxValue + " -owner: " + users.get(maxValueUserId-1).getName().getFirstname() + " " + users.get(maxValueUserId-1).getName().getLastname());
    }
}

