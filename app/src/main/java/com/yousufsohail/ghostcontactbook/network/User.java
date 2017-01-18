package com.yousufsohail.ghostcontactbook.network;

import com.google.gson.annotations.SerializedName;


public class User {

    @SerializedName("gender")
    public String gender;

    @SerializedName("name")
    private UserName name;

    @SerializedName("email")
    private String email;

    @SerializedName("dob")
    private String dob;

    @SerializedName("registered")
    private String registered;

    @SerializedName("phone")
    private String phone;

    @SerializedName("cell")
    private String cell;

    @SerializedName("picture")
    private UserPicture picture;

    public String getGender() {
        return gender;
    }

    public UserName getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDob() {
        return dob;
    }

    public String getRegistered() {
        return registered;
    }

    public String getPhone() {
        return phone;
    }

    public String getCell() {
        return cell;
    }

    public UserPicture getPicture() {
        return picture;
    }

    public class UserName {

        @SerializedName("title")
        public String title;
        @SerializedName("first")
        public String first;
        @SerializedName("last")
        public String last;
    }

    public class UserPicture {

        @SerializedName("large")
        public String large;
        @SerializedName("medium")
        public String medium;
        @SerializedName("thumbnail")
        public String thumbnail;

    }
}
