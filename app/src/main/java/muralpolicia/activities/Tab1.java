package muralpolicia.activities;


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
import java.util.Date;
import java.util.List;

import muralpolicia.model.Foto;
import muralpolicia.model.Individuo;

/**
 * Created by IrbeinTepes on 26/09/2017.
 */

public class Tab1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);

        //grid
        final List<Individuo> listaIndividuosTeste = new ArrayList<>();
        listaIndividuosTeste.add(new Individuo(1,"nome1",new Foto(1,null,"foto.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(2,"nome1",new Foto(2,null,"foto.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(3,"nome1",new Foto(3,null,"foto.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(4,"nome1",new Foto(4,null,"foto.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(5,"nome1",new Foto(5,null,"foto.jpg", new Date())));
        MuralGrid adapter = new MuralGrid(getActivity(), listaIndividuosTeste);
        GridView grid = (GridView) rootView.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "You Clicked at " +listaIndividuosTeste.get(position).getId(), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }
}
