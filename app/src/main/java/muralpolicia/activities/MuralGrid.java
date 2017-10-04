package muralpolicia.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import muralpolicia.model.Individuo;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class MuralGrid extends BaseAdapter {

    private Context mContext;
    private ArrayList<Individuo> listaIndividuos;

    public MuralGrid(Context c,ArrayList listaIndividuos) {
        mContext = c;
        this.listaIndividuos = listaIndividuos;
    }

    //até aqui

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listaIndividuos.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            //continuar
            grid = new View(mContext);
            //grid = inflater.inflate(R.layout.grid_single, null);
            //TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            //ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            //textView.setText(listaIndividuos.get(position).getNome());
            //imageView.setImageResource(listaIndividuos.get(position).getFoto().getId());
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}
