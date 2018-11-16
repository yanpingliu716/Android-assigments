package com.example.administrator.gymclub;

/**
 * Created by Administrator on 2018/11/7.
 */

public class Coach {

    private String name;
    private String motto;
    private int imageId;



    public Coach(String name,String motto,int imageId) {
        this.name = name;
        this.motto = motto;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
