package com.psalms.platenumberocr;

public class OfficerModel {
    private String username;
    private String password;
    private String rank;

    public OfficerModel(String username, String password, String rank) {
        this.username = username;
        this.password = password;
        this.rank = rank;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "OfficerModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
