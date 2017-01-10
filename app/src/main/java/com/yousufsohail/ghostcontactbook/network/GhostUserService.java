package com.yousufsohail.ghostcontactbook.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by saif-ul-malook on 10-Jan-17.
 */

public interface GhostUserService {

    @GET("api/")
    Call<GetUserListResponse> getGhostUserList(@Query("results") int number);

}
