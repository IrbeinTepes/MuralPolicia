package muralpolicia.activity;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import muralpolicia.model.Individuo;
import muralpolicia.model.IndividuoMural;

/**
 * Created by IrbeinTepes on 03/10/2017.
 */

public class MuralGrid extends GenericGrid {

    public MuralGrid(Context c, List lista, int layout) {
        super(c, lista,layout);
    }

    @Override
        protected void makeItem(View grid, int position) {
            ImageView imageView = grid.findViewById(R.id.grid_image);
            if(getLista().get(position) instanceof IndividuoMural){
                Picasso.with(getContext()).load(((IndividuoMural)getLista().get(position)).getIndId().getInscitFotoCollection().get(0).getFotoArq()).centerCrop().fit().into(imageView);
            }else{
                if(((Individuo)getLista().get(position)).getInscitFotoCollection().size()>0){
                    Picasso.with(getContext()).load(((Individuo)getLista().get(position)).getInscitFotoCollection().get(0).getFotoArq()).centerCrop().fit().into(imageView);
                }else{
                    Picasso.with(getContext()).load("https://www.shareicon.net/data/128x128/2016/04/10/747376_man_512x512.png").centerCrop().fit().into(imageView);
                }

            }


        }

}

