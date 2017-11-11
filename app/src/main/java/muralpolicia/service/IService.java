package muralpolicia.service;

import java.util.List;

import muralpolicia.model.Individuo;
import muralpolicia.model.User;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by IrbeinTepes on 11/10/2017.
 */

public interface IService {

    @GET("mural/")
    Call<List<Individuo>> listaMural();

    @POST("usuarioservice/")
    Call<User> validaLogin(@Body User user);

    @GET("individuo/{id}")
    Call<List<Individuo>> getInfoIndividio(@Path("id") String id);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("127.0.0.1:8081/MuralService/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
