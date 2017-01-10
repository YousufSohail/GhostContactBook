package com.yousufsohail.ghostcontactbook.network;

import com.google.gson.annotations.SerializedName;


public class User {

    @SerializedName("gender")
    private String gender;

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

    private class UserName {

        @SerializedName("title")
        private String title;
        @SerializedName("first")
        private String first;
        @SerializedName("last")
        private String last;
    }

    private class UserPicture {

        @SerializedName("large")
        private String large;
        @SerializedName("medium")
        private String medium;
        @SerializedName("thumbnail")
        private String thumbnail;

    }
}
