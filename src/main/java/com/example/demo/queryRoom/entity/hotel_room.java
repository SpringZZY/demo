package com.example.demo.queryRoom.entity;

/***
 * 宾馆房间实体类
 */
public class hotel_room {
    public String room_num;
    public String room_title;
    public float room_price;

    public String getRoom_num() {
        return room_num;
    }

    public void setRoom_num(String room_num) {
        this.room_num = room_num;
    }

    public String getRoom_title() {
        return room_title;
    }

    public void setRoom_title(String room_title) {
        this.room_title = room_title;
    }

    public float getRoom_price() {
        return room_price;
    }

    public void setRoom_price(float room_price) {
        this.room_price = room_price;
    }
}
