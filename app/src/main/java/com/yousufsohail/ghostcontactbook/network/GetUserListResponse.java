package com.yousufsohail.ghostcontactbook.network;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by saif-ul-malook on 10-Jan-17.
 */
public class GetUserListResponse {

    @SerializedName("results")
    private List<User> users;

    public GetUserListResponse(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
