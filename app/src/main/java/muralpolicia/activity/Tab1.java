package muralpolicia.activity;


import android.os.Bundle;
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

import muralpolicia.model.Individuo;
import muralpolicia.model.IndividuoMural;
import muralpolicia.service.IService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by IrbeinTepes on 26/09/2017.
 */

public class Tab1 extends Fragment {

    private MuralGrid adapter;
    private GridView grid;
    private ViewGroup container;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1, container, false);
        this.container = container;
        adapter = new MuralGrid(getActivity(), new ArrayList<IndividuoMural>(), R.layout.mural_grid_item);

        loadGrid();
        grid = rootView.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        ((ViewPager)container).setCurrentItem(1);
        return rootView;
    }

    public void loadGrid(){
        Call<List<IndividuoMural>> indMural = IService.retrofit.create(IService.class).listaMural();
        indMural.enqueue(new Callback<List<IndividuoMural>>() {

            @Override
            public void onResponse(Call<List<IndividuoMural>> listIndMural, Response<List<IndividuoMural>> response) {
                if(response.body() != null) {

                    adapter.setLista(response.body());
                    adapter.notifyDataSetChanged();
                    grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view,
                                                int position, long id) {
                            //((SectionsPagerAdapter)((ViewPager)container).getAdapter()).tabs.set(0,new Tab3());
                            Toast.makeText(getActivity(), "Implementação futura" + ((IndividuoMural)adapter.getLista().get(position)).getId(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }else{
                    Toast.makeText(getContext() , "SEM INDÍVIDUOS PARA MOSTRAR", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<IndividuoMural>> call, Throwable t) {
                Toast.makeText(getContext() , "ERRO AO ESTABELECER CONEXÃO", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });
    }

    public void searchIndividuo(int[] characteristics){
        Call<List<Individuo>> indMural = IService.retrofit.create(IService.class).pesquisa(characteristics);
        indMural.enqueue(new Callback<List<Individuo>>() {

            @Override
            public void onResponse(Call<List<Individuo>> listIndMural, Response<List<Individuo>> response) {
                if(response.body().size() > 0) {

                    adapter.setLista(response.body());
                    adapter.notifyDataSetChanged();
                    grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view,
                                                int position, long id) {
                            Toast.makeText(getActivity(), "You Clicked at " + ((IndividuoMural)adapter.getLista().get(position)).getId(), Toast.LENGTH_SHORT).show();
                            ((ViewPager)container).setCurrentItem(1);
                        }
                    });
                    Toast.makeText(getContext() , "BUSCA EFETUADA", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext() , "SEM INDÍVIDUOS PARA MOSTRAR", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Individuo>> call, Throwable t) {
                Toast.makeText(getContext() , "ERRO AO ESTABELECER CONEXÃO", Toast.LENGTH_SHORT).show();
                t.printStackTrace();
            }
        });
    }

}
