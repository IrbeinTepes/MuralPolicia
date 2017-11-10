package muralpolicia.service;

import java.util.List;

import muralpolicia.model.Individuo;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by IrbeinTepes on 11/10/2017.
 */

public interface IService {

    @GET("mural/")
    Call<List<Individuo>> listaMural();

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("127.0.0.1:8081/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
