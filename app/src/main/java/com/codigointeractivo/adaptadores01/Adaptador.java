package com.codigointeractivo.adaptadores01;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by usuario on 24/2/17.
 */

public class Adaptador extends BaseAdapter {

    Context contexto;
    List<Datos> ListaObjetos;

    static class ViewHolder {
        private ImageView imagen;
        private TextView titulo;
        private TextView detalle;

        public ViewHolder(View vista) {
            imagen = (ImageView) vista.findViewById(R.id.imageView);
            titulo = (TextView) vista.findViewById(R.id.textTitulo);
            detalle = (TextView) vista.findViewById(R.id.txtDetalle);
        }

    }

    public Adaptador(Context contexto, List<Datos> listaObjetos) {
        this.contexto = contexto;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size();  //retorna la cantidad de elementos de la lista
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        View vista = convertView;

        if (vista == null) {
            LayoutInflater inflate = LayoutInflater.from(contexto);
            vista = inflate.inflate(R.layout.itemlistview,null);
            holder = new ViewHolder(vista);
            vista.setTag(holder);
        }
        else {
            holder = (ViewHolder) vista.getTag();
        }

        Datos objeto = ListaObjetos.get(position);
        holder.imagen.setImageResource(objeto.getImagen());
        holder.detalle.setText(objeto.getDetalle());
        holder.titulo.setText(objeto.getTitulo());


        return vista;

    }
}
