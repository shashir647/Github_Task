package com.myowncompany.github_task;

/**
 * Created by SHASHI on 11-07-2016.
 */

public class Details {
    private int id;
    private String name;
    private String commit;
    private String message;

    public Details(int id, String name, String commit, String message) {
        this.id = id;
        this.name = name;
        this.commit = commit;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }
}
