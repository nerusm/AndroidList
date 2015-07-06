package course.labs.creatshelf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by suren on 5/7/15.
 */
public class ShelfItemArrayAdapter extends ArrayAdapter<Item> {
    private Context c;
    private int id;
    private List<Item>items;
    public ShelfItemArrayAdapter(Context context, int resource, List<Item> objects) {
        super(context, resource, objects);
        c=context;
        id=resource;
        items = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if(v==null){
            LayoutInflater vi = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(id,null);
        }

                   /* create a new view of my layout and inflate it in the row */
        //convertView = ( RelativeLayout ) inflater.inflate( resource, null );

        final Item o = items.get(position);
        if(o!=null){
            ImageView iv1 = (ImageView)v.findViewById(R.id.imageView1);
            ImageView iv2 = (ImageView)v.findViewById(R.id.imageView2);
            ImageView iv3 = (ImageView)v.findViewById(R.id.imageView3);

            String uri1 = "drawable/"+o.getCover_1();
            String uri2 = "drawable/"+o.getCover_2();
            String uri3 = "drawable/"+o.getCover_3();

            int imageResource = c.getResources().getIdentifier(uri1, null, c.getPackageName());
            Drawable image = c.getResources().getDrawable(imageResource);
            iv1.setImageDrawable(image);

            imageResource = c.getResources().getIdentifier(uri2, null, c.getPackageName());
            image = c.getResources().getDrawable(imageResource);
            iv2.setImageDrawable(image);

            imageResource = c.getResources().getIdentifier(uri3, null, c.getPackageName());
            image = c.getResources().getDrawable(imageResource);
            iv3.setImageDrawable(image);

        }
        return v;

    }

    @Override
    public Item getItem(int position) {
        return super.getItem(position);
    }
}
