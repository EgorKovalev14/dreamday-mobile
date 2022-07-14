package ru.timcock.mayday.data;

import com.google.gson.Gson;

public class Sovet {
    private String text_head;
    private String text;
    private String tag;
    private String img;
    private Integer id;

    public Sovet() {}

    public Sovet(String text_head, String text, String tag, String img, Integer id) {
        this.text_head = text_head;
        this.text = text;
        this.tag = tag;
        this.img = img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText_head() {
        return text_head;
    }

    public void setText_head(String text_head) {
        this.text_head = text_head;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}