package muralpolicia.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import muralpolicia.model.Cabelo;
import muralpolicia.model.Cor;
import muralpolicia.model.Individuo;
import muralpolicia.model.IndividuoMural;
import muralpolicia.model.Olho;
import muralpolicia.service.IService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by IrbeinTepes on 26/09/2017.
 */

public class Tab2 extends Fragment {

    int[] listaCaracteristicas = new int[3];
    private PesquisaGrid adapter;
    private int[] characteristics;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1, container, false);

        //grid

        final List<Individuo> listaIndividuosTeste = new ArrayList<>();

        listaIndividuosTeste.add(new Individuo(7,"nome1"));
        listaIndividuosTeste.add(new Individuo(8,"nome1"));
        listaIndividuosTeste.add(new Individuo(9,"nome1"));
        listaIndividuosTeste.add(new Individuo(9,"nome1"));
/*

        listaIndividuosTeste.add(new Individuo(1,"S/ DESCRIÇÃO",new Foto(1,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        //listaIndividuosTeste.add(new Individuo(2,"",new Foto(2,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(3,"CICATRIZ",new Foto(3,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(4,"SARDA",new Foto(4,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(5,"FALTANDO DEDO",new Foto(5,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(6,"OLHO MACHUCADO",new Foto(6,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));

        listaIndividuosTeste.add(new Individuo(7,"nome1");
        listaIndividuosTeste.add(new Individuo(8,"nome1");
        listaIndividuosTeste.add(new Individuo(9,"nome1");
        listaIndividuosTeste.add(new Individuo(9,"nome1");
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"https://www.aprenderexcel.com.br//imagens/post/385/2901-1.jpg", new Date())));
*/


        PesquisaGrid adapter = new PesquisaGrid(getActivity(), listaIndividuosTeste, R.layout.pesquisa_grid_item);



        GridView grid = rootView.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                listaCaracteristicas[0] = listaIndividuosTeste.get(position).getId();
                //((ViewPager)container).setCurrentItem(1);
            }
        });

        return rootView;
    }

    public void loadGridCorPele(){
        Call<List<Cor>> call = IService.retrofit.create(IService.class).getCor();
        call.enqueue(new Callback<List<Cor>>() {

            @Override
            public void onResponse(Call<List<Cor>> call, Response<List<Cor>> response) {
                if(response.body() != null) {
                    if(adapter == null){
                        adapter = new PesquisaGrid(getActivity(), new ArrayList<Cor>(), R.layout.pesquisa_grid_item);
                    }
                    adapter.setLista(response.body());
                    adapter.notifyDataSetChanged();
                }else{
                    Toast.makeText(getContext() , "SEM INDÍVIDUOS PARA MOSTRAR", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Cor>> call, Throwable t) {
                Toast.makeText(getContext() , "ERRO AO ESTABELECER CONEXÃO", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });
        //recallService
    }

    public void loadGridCorCabelo(){
        Call<List<Cabelo>> call = IService.retrofit.create(IService.class).getCabelo();
        call.enqueue(new Callback<List<Cabelo>>() {

            @Override
            public void onResponse(Call<List<Cabelo>> listIndMural, Response<List<Cabelo>> response) {
                if(response.body() != null) {
                    if(adapter == null){
                        adapter = new PesquisaGrid(getActivity(), new ArrayList<IndividuoMural>(), R.layout.mural_grid_item);
                    }
                    adapter.setLista(response.body());
                    adapter.notifyDataSetChanged();
                }else{
                    Toast.makeText(getContext() , "SEM INDÍVIDUOS PARA MOSTRAR", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Cabelo>> call, Throwable t) {
                Toast.makeText(getContext() , "ERRO AO ESTABELECER CONEXÃO", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });
        //recallService
    }

    public void loadGridCorOlho(){
        Call<List<Olho>> call = IService.retrofit.create(IService.class).getOlho();
        call.enqueue(new Callback<List<Olho>>() {

            @Override
            public void onResponse(Call<List<Olho>> listIndMural, Response<List<Olho>> response) {
                if(response.body() != null) {
                    if(adapter == null){
                        adapter = new PesquisaGrid(getActivity(), new ArrayList<Olho>(), R.layout.mural_grid_item);
                    }
                    adapter.setLista(response.body());
                    adapter.notifyDataSetChanged();
                }else{
                    Toast.makeText(getContext() , "SEM INDÍVIDUOS PARA MOSTRAR", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Olho>> call, Throwable t) {
                Toast.makeText(getContext() , "ERRO AO ESTABELECER CONEXÃO", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });
        //recallService
    }

}
