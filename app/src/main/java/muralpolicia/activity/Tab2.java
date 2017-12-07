package muralpolicia.activity;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
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
    private GridView grid;
    private int[] characteristics;
    ViewGroup container;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1, container, false);
        this.container = container;

        adapter = new PesquisaGrid(getActivity(), new ArrayList<Parcelable>(), R.layout.pesquisa_grid_item);

        loadGridCorPele();
        grid= rootView.findViewById(R.id.grid);
        grid.setAdapter(adapter);

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
                    grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view,
                                                int position, long id) {
                            listaCaracteristicas[0] = ((Cor)adapter.getLista().get(position)).getId();
                            loadGridCorCabelo();
                            //((ViewPager)container).setCurrentItem(1);
                        }
                    });
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
            public void onResponse(Call<List<Cabelo>> call, Response<List<Cabelo>> response) {
                if(response.body() != null) {
                    if(adapter == null){
                        adapter = new PesquisaGrid(getActivity(), new ArrayList<Cabelo>(), R.layout.pesquisa_grid_item);
                    }
                    adapter.setLista(response.body());
                    adapter.notifyDataSetChanged();
                    grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view,
                                                int position, long id) {
                            listaCaracteristicas[1] = ((Cabelo)adapter.getLista().get(position)).getId();
                            loadGridCorOlho();
                            //((ViewPager)container).setCurrentItem(1);
                        }
                    });
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
            public void onResponse(Call<List<Olho>> call, Response<List<Olho>> response) {
                if(response.body() != null) {
                    if(adapter == null){
                        adapter = new PesquisaGrid(getActivity(), new ArrayList<Olho>(), R.layout.pesquisa_grid_item);
                    }
                    adapter.setLista(response.body());
                    adapter.notifyDataSetChanged();
                    grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view,
                                                int position, long id) {
                            listaCaracteristicas[2] = ((Olho)adapter.getLista().get(position)).getId();
                            loadGridCorPele();
                            ((Tab1)((SectionsPagerAdapter)((ViewPager)container).getAdapter()).getItem(0)).searchIndividuo(listaCaracteristicas);
                            ((ViewPager)container).setCurrentItem(0);

                        }
                    });
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
