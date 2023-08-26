package com.example.a03listadepropiedadeslp;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

public class MainActivityViewModel extends AndroidViewModel {
    private Context context;
    private ArrayList<Inmueble> lista = new ArrayList<>();
    private MutableLiveData<ArrayList<Inmueble>> mut_lista;


    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        context = application.getApplicationContext();
    }

    public MutableLiveData<ArrayList<Inmueble>> getMutable_list() {
        if (mut_lista == null) {
            mut_lista = new MutableLiveData<ArrayList<Inmueble>>();
        }

return mut_lista;


    }

    public void cargarPropiedades(){
        lista.add(new Inmueble(R.drawable.img,"San martin 234",130000.50));
        lista.add(new Inmueble(R.drawable.img2,"Rivadavia 850",200000.00));
        lista.add(new Inmueble(R.drawable.img4,"Av. Cruz de Puedra 234",150000.00));
        lista.add(new Inmueble(R.drawable.img3,"Av. Avellaneda 323",150000.00));
        lista.add(new Inmueble(R.drawable.img6,"Los Sauces 825",135430.00));
        lista.add(new Inmueble(R.drawable.img7,"Av. Pellegrini 523",125848.00));
        lista.add(new Inmueble(R.drawable.img8,"Av. los nogales 125",23233.33));


        mut_lista.setValue(lista);
    }

}
