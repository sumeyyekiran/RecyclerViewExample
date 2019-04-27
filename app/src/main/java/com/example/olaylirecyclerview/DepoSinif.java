package com.example.olaylirecyclerview;

import java.util.ArrayList;

public class DepoSinif {

    private String personName;
    private String jobProfile;
    private String productName;
    private String productDescription;
    private int imageID;
    private String id;


    public DepoSinif() {

    }

    public DepoSinif(String personName, String jobProfile, String id) {
        this.personName = personName;
        this.jobProfile = jobProfile;
        this.id = id;
    }
    public DepoSinif(int imageID){this.imageID=imageID;}

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }

    public int getImageID() {
        return imageID;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }


    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }




}
