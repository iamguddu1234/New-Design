package com.example.new_pages;

public class model {
    String img;
    String name;
    private int imgIocn;


    public model(String name, int imgIocn) {
        this.name = name;
        this.imgIocn = imgIocn;
    }

    public int getImgIocn() {
        return imgIocn;
    }

    public void setImgIocn(int imgIocn) {
        this.imgIocn = imgIocn;
    }

    public model(String img, String name) {
        this.img = img;
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
