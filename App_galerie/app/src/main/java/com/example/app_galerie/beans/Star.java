package com.example.app_galerie.beans;

public class Star {
    private String img;
    private String name;
    private int id;
    private float star;
    private static int comp;
    public Star(String name,String img,float star){
        id=++comp;
        this.img=img;
        this.name=name;
        this.star=star;
    }

    public String getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }
}
