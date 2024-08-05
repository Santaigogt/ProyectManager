/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comment;

import Users.user;

/**
 *
 * @author jcone
 */
public class Comments {
    private int id;
    private user user;
    private String comment;

    public int getId() {
        return id;
    }

    public user getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    

    public Comments(int id, user user, String comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    public Comments() {
        this(0,null,"");
    }

    @Override
    public String toString() {
        return "Comments{" + "id=" + id + ", user=" + user + ", comment=" + comment + '}';
    }
   
    
    
}
