package com.heltonbustos.ejemplomvp01.interactor.modeloRecyclerView;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.heltonbustos.ejemplomvp01.R;

import java.util.ArrayList;

public class AdaptadorDatos extends RecyclerView.Adapter<AdaptadorDatos.ViewHolderDator>{

    ArrayList<RegistroEquiposDatos> listDatos;
    Context context;

    public AdaptadorDatos(ArrayList<RegistroEquiposDatos> listDatos, Context context) {
        this.listDatos = listDatos;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolderDator onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.registros_equipos, null, false);
        return new ViewHolderDator(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolderDator holder, int position) {
        Bitmap bit1 = listDatos.get(position).getB1();
        Bitmap bit2 = listDatos.get(position).getB2();
        String cod = listDatos.get(position).getCodigo();
        String nom = listDatos.get(position).getNombre();
        String fec = listDatos.get(position).getFecha();
        String mar = listDatos.get(position).getMarca();
        String mod = listDatos.get(position).getModelo();


        String bol = listDatos.get(position).getBolso();
        String caj = listDatos.get(position).getEquipoEnCaja();
        String car = listDatos.get(position).getCargador();

        String man = listDatos.get(position).getManualEnCaja();
        String gar = listDatos.get(position).getGarantiaEnCaja();
        String enc = listDatos.get(position).getEnciendeCargaSo();

        String mon = listDatos.get(position).getMonitorPoblemas();
        String aud = listDatos.get(position).getAudioProblemas();
        String tou = listDatos.get(position).getTouchPadProblemas();






        holder.imagen1.setImageBitmap(bit1);
        holder.imagen2.setImageBitmap(bit2);
        holder.codigo.setText(cod);
        holder.nombre.setText(nom);
        holder.fecha.setText(fec);
        holder.marca.setText(mar);
        holder.modelo.setText(mod);

        holder.bolso.setText(bol);
        holder.EquipoEnCaja.setText(caj);
        holder.cargador.setText(car);
        holder.ManualEnCaja.setText(man);
        holder.GarantiaEnCaja.setText(gar);
        holder.EnciendeCargaSo.setText(enc);

        holder.MonitorPoblemas.setText(mon);
        holder.AudioProblemas.setText(gar);
        holder.TouchPadProblemas.setText(enc);
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDator extends RecyclerView.ViewHolder{
        ImageView imagen1;
        ImageView imagen2;
        TextView codigo;
        TextView nombre;
        TextView fecha;
        TextView marca;
        TextView modelo;

        TextView bolso;
        TextView  EquipoEnCaja;
        TextView cargador;

        TextView ManualEnCaja;
        TextView  GarantiaEnCaja;
        TextView EnciendeCargaSo;

        TextView MonitorPoblemas;
        TextView  AudioProblemas;
        TextView TouchPadProblemas;

        public ViewHolderDator(@NonNull View itemView) {
            super(itemView);
            imagen1 = itemView.findViewById(R.id.img1Equipo);
            imagen2 = itemView.findViewById(R.id.img2Equipo);
            codigo = itemView.findViewById(R.id.txtCodigoEquipoL);
            nombre = itemView.findViewById(R.id.txtNombreEquipoL);
            fecha = itemView.findViewById(R.id.txtFechaEquipoL);
           marca = itemView.findViewById(R.id.txtMarcaIngresoL);
           modelo= itemView.findViewById(R.id.txtModeloIngresoL);

            bolso = itemView.findViewById(R.id.txtBolsoEquipoL);
            EquipoEnCaja = itemView.findViewById(R.id.txtEquipoEnCajaL);
            cargador = itemView.findViewById(R.id.txtCargadorEquipoL);



            ManualEnCaja = itemView.findViewById(R.id.txtManualEncajaL);
            GarantiaEnCaja = itemView.findViewById(R.id.txtGarantiaEnCajaL);
            EnciendeCargaSo = itemView.findViewById(R.id.txtEnciendeCargaSoL);
            MonitorPoblemas = itemView.findViewById(R.id.txtMonitorPoblemasL);
            AudioProblemas = itemView.findViewById(R.id.txtAudioProblemasL);
            TouchPadProblemas = itemView.findViewById(R.id.txtTouchPadProblemasL);




        }
    }
}
