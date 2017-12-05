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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1, container, false);

        adapter = new MuralGrid(getActivity(), new ArrayList<IndividuoMural>(), R.layout.mural_grid_item);

        loadGrid();
        GridView grid = rootView.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "You Clicked at " + ((Individuo)adapter.getLista().get(position)).getId(), Toast.LENGTH_SHORT).show();
                ((ViewPager)container).setCurrentItem(1);
            }
        });
        return rootView;
    }

    public void loadGrid(){
        Call<List<IndividuoMural>> indMural = IService.retrofit.create(IService.class).listaMural();
        indMural.enqueue(new Callback<List<IndividuoMural>>() {

            @Override
            public void onResponse(Call<List<IndividuoMural>> listIndMural, Response<List<IndividuoMural>> response) {
                if(response.body() != null) {
                    if(adapter == null){
                         adapter = new MuralGrid(getActivity(), new ArrayList<IndividuoMural>(), R.layout.mural_grid_item);
                    }
                    adapter.setLista(response.body());
                    adapter.notifyDataSetChanged();
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
        //recallService
    }
}
