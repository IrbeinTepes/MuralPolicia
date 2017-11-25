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
import java.util.Date;
import java.util.List;

import muralpolicia.model.Foto;
import muralpolicia.model.Individuo;

/**
 * Created by IrbeinTepes on 26/09/2017.
 */

public class Tab1 extends Fragment {

    private MuralGrid adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1, container, false);

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

        //recallService

        //grid
        final List<Individuo> listaIndividuosTeste = new ArrayList<>();
        listaIndividuosTeste.add(new Individuo(1,"nome1",new Foto(1,"https://randomuser.me/api/portraits/men/30.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(2,"nome1",new Foto(2,"https://randomuser.me/api/portraits/men/81.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(3,"nome1",new Foto(3,"https://randomuser.me/api/portraits/men/66.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(4,"nome1",new Foto(4,"https://randomuser.me/api/portraits/men/50.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(5,"nome1",new Foto(5,"https://randomuser.me/api/portraits/men/0.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(6,"nome1",new Foto(6,"https://randomuser.me/api/portraits/men/70.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(7,"nome1",new Foto(7,"https://randomuser.me/api/portraits/men/38.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(8,"nome1",new Foto(8,"https://randomuser.me/api/portraits/men/2.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,"https://randomuser.me/api/portraits/men/58.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,"https://randomuser.me/api/portraits/women/92.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,"https://randomuser.me/api/portraits/women/93.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,"https://randomuser.me/api/portraits/women/52.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,"https://randomuser.me/api/portraits/women/43.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,"https://randomuser.me/api/portraits/women/40.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,"https://randomuser.me/api/portraits/women/41.jpg", new Date())));

        adapter = new MuralGrid(getActivity(), listaIndividuosTeste, R.layout.mural_grid_item);



    }
}
