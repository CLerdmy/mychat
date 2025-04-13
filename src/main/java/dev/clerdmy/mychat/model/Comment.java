package dev.clerdmy.mychat.model;

import java.time.LocalDateTime;

public class Comment {

    private int ID;
    private String content;
    private User user;
    private LocalDateTime dateTime;

    public Comment() {}

    public int getID() {
        return ID;
    }

    public String getContent() {
        return content;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

}
