package org.apache.maven;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;

public class Values {
    final ObjectMapper objectMapper = new ObjectMapper();
    List<ProductItem> productItems;

    {
        try {
            productItems = objectMapper.readValue((URLConnectionReaderProducts.reader()), new TypeReference<>(){});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    String currentCategory = "null";
    double total = 0.0;

    HashMap<String, Double> totalValueOf = new HashMap<>();
    public void totalValueOfProd(){
        for (ProductItem productItem : productItems) {
            if(currentCategory.equals(productItem.getCategory())){
                total += productItem.getPrice();
                totalValueOf.put(this.currentCategory,total);
            }
            else{
                total = 0.0;
                this.currentCategory = productItem.getCategory();
                this.total += productItem.getPrice();
            }
        }
        for (ProductItem productItem : productItems){
            if (!currentCategory.equals(productItem.getCategory())) {
                this.currentCategory = productItem.getCategory();
                System.out.println("Total value of " + this.currentCategory + " category is: " + totalValueOf.get(productItem.getCategory()));
            }
            else{
                this.currentCategory = productItem.getCategory();
            }
        }
    }
}
