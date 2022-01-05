package com.anma.sb.mongodbgenerator.models.web;

public class PersonWebArray {

    private Meta meta;
    private PersonWeb[] data;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public PersonWeb[] getData() {
        return data;
    }

    public void setData(PersonWeb[] data) {
        this.data = data;
    }
}
