package models;

import java.util.ArrayList;
import java.time.LocalDateTime;


public class Post {

    private final String content;
    private static ArrayList<Post> instances = new ArrayList<>();
    private boolean published; //i’m new
    private LocalDateTime createdAt; //see constructor and my method

    public Post (String content){
        this.content = content;
        this.published = false; //also new
        this.createdAt = LocalDateTime.now();
        instances.add(this);
    }

    public String getContent() {
        return content;
    }

    public static ArrayList<Post> getAll(){
        return instances;
    }

    public static void clearAllPosts(){
        instances.clear();
    }
    public boolean getPublished(){ //new too
        return this.published;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

}
