package com.springtraining.emailapp.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "email-collection")
public class BlockchainInfo {

    @Id
    private String id;
    private String altName;
    private Double price;


    public BlockchainInfo (String id, String altName, Double price) {
        this.id = id;
        this.altName= altName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAltName() {
        return altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
