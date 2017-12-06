package muralpolicia.service;

import java.util.List;

import muralpolicia.model.Cabelo;
import muralpolicia.model.Cor;
import muralpolicia.model.Individuo;
import muralpolicia.model.IndividuoMural;
import muralpolicia.model.Olho;
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

    @GET("individuosmuralservice/")
    Call<List<IndividuoMural>> listaMural();

    @POST("usuarioservice/login")
    Call<User> validaLogin(@Body User user);

    @GET("individuoscorservice/")
    Call<List<Cor>> getCor();

    @GET("individuosolhosservice/")
    Call<List<Olho>> getOlho();

    @GET("individuoscabeloservice/")
    Call<List<Cabelo>> getCabelo();

    @POST("pesquisa/characteristics")
    Call<List<Individuo>> pesquisa(@Body int[] characteristics);

    @GET("individuo/{id}")
    Call<List<Individuo>> getInfoIndividio(@Path("id") String id);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://10.0.2.2:8081/MuralService/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
