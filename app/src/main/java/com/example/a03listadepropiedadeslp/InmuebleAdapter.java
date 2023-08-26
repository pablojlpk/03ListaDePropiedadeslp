package com.example.a03listadepropiedadeslp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class InmuebleAdapter extends ArrayAdapter<Inmueble> {
    private Context context;
    private List <Inmueble> lista;
    private  LayoutInflater li;


    public InmuebleAdapter(@NonNull Context context, int resource, @NonNull List<Inmueble> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context = context;
        this.lista = objects;
        this.li=li;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView=li.inflate(R.layout.item_lista,parent,false);

        }
         Inmueble inmueble = lista.get(position);
        ImageView foto=itemView.findViewById(R.id.foto);
        foto.setImageResource(inmueble.getFoto());
        TextView direccion = itemView.findViewById(R.id.tvdireccion);
        direccion.setText(inmueble.getDireccion());
        TextView precio = itemView.findViewById(R.id.tvprecio);
        precio.setText(inmueble.getPrecio()+"");
        return  itemView;
    }

    @Override
    public int getCount() {
        return lista.size();
    }
}


