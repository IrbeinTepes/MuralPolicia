package muralpolicia.activities;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab1, container, false);

        //grid
        final List<Individuo> listaIndividuosTeste = new ArrayList<>();
        listaIndividuosTeste.add(new Individuo(1,"nome1",new Foto(1,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(2,"nome1",new Foto(2,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(3,"nome1",new Foto(3,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(4,"nome1",new Foto(4,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(5,"nome1",new Foto(5,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(6,"nome1",new Foto(6,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(7,"nome1",new Foto(7,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(8,"nome1",new Foto(8,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));
        listaIndividuosTeste.add(new Individuo(9,"nome1",new Foto(9,null,"http://www.aprenderexcel.com.br//imagens/noticia/385/2901-1.jpg", new Date())));

        MuralGrid adapter = new MuralGrid(getActivity(), listaIndividuosTeste);
        GridView grid = (GridView) rootView.findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "You Clicked at " +listaIndividuosTeste.get(position).getId(), Toast.LENGTH_SHORT).show();
                ((ViewPager)container).setCurrentItem(1);
            }
        });
        return rootView;
    }
}
