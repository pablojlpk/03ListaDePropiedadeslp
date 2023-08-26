package com.example.a03listadepropiedadeslp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.a03listadepropiedadeslp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private MainActivityViewModel vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
setContentView(binding.getRoot());
        vm = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
vm.getMutable_list().observe(this, new Observer<ArrayList<Inmueble>>() {
    @Override
    public void onChanged(ArrayList<Inmueble> inmuebles) {
 InmuebleAdapter va=new InmuebleAdapter(MainActivity.this,binding.milista.getId(),inmuebles,getLayoutInflater());
binding.milista.setAdapter(va);;

    }
});


vm.cargarPropiedades();
    }
}