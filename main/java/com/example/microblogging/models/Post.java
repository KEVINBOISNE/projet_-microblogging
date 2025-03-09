package com.example.microblogging.models;

public class Post {
    private String username;
    private String message;
    private String timestamp;

    public Post(String username, String message, String timestamp) {
        this.username = username;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    // Ajouter la méthode getAuthor à l'intérieur de la classe
    public String getAuthor() {
        return username;
    }
}
