package com.heltonbustos.ejemplomvp01.interactor.test;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.heltonbustos.ejemplomvp01.interactor.bd.ConexionBD;

import java.util.ArrayList;
import java.util.List;

public class TestingSQLite {

    Context contexto;
    List<RegistroEquipoModelo> lista = new ArrayList<>();

    public TestingSQLite(Context contexto) {
        this.contexto = contexto;
    }

    public void listarTodo(){
        String codigo = "";
        String nombre = "";
        String fecha = "";
        String marca = "";
        String modelo = "";

        String bolso = "";
        String EquipoEncaja = "";

        String cargador = "";
        String ManualEncaja = "";
        String GarantiaEnCaja = "";
        String EnciendeCargaSo = "";
        String MonitorPoblemas = "";
        String AudioProblemas = "";
        String TouchPadProblemas = "";


        ConexionBD conexion = new ConexionBD(contexto, "administracion", null, 1);
        SQLiteDatabase bd = conexion.getWritableDatabase();

        Cursor fila = bd.rawQuery("SELECT * FROM registroequipo", null);

        if (fila.moveToFirst()){
            do {
                codigo = fila.getString(0);
                nombre = fila.getString(1);
                fecha = fila.getString(2);
                marca = fila.getString(3);
                modelo = fila.getString(4);

                bolso = fila.getString(5);
                EquipoEncaja = fila.getString(6);
                cargador = fila.getString(7);

                ManualEncaja = fila.getString(8);
                GarantiaEnCaja = fila.getString(9);
                EnciendeCargaSo = fila.getString(10);

                MonitorPoblemas = fila.getString(11);
                AudioProblemas = fila.getString(12);
                TouchPadProblemas = fila.getString(13);




                lista.add(new RegistroEquipoModelo(codigo, nombre, fecha, marca,modelo,bolso,EquipoEncaja,cargador,
                        ManualEncaja,GarantiaEnCaja,EnciendeCargaSo,MonitorPoblemas,AudioProblemas,TouchPadProblemas));
            } while(fila.moveToNext());
        }
        fila.close();
        bd.close();
    }

}
