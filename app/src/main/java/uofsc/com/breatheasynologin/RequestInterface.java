package uofsc.com.breatheasynologin;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import uofsc.com.breatheasynologin.models.ServerRequest;
import uofsc.com.breatheasynologin.models.ServerResponse;

/**
 * Created by danea on 6/29/2017.
 */

public interface RequestInterface {

    @POST("breatheasy-login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);
}
