package muralpolicia.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import muralpolicia.model.Individuo;

/**
 * Created by IrbeinTepes on 11/8/2017.
 */

public abstract class GenericGrid extends BaseAdapter {

    private Context context;
    private List lista;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public GenericGrid(Context c, List lista) {
        context = c;
        this.lista = lista;
    }

    //até aqui

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return lista.size();
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
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            grid = inflater.inflate(R.layout.mural_grid_item, parent,false);

            makeItem(grid, position);

        } else {
            grid = convertView;
        }

        return grid;
    }

    protected abstract void makeItem(View grid, int position);
}
