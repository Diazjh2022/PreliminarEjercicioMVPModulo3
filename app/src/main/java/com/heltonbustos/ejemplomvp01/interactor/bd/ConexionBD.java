package com.heltonbustos.ejemplomvp01.interactor.bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionBD extends SQLiteOpenHelper {
    public ConexionBD(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL("create table usuarios(user text primary key, nombre text, pass text)");

        bd.execSQL("create table registroequipo(codigo text primary key, nombre text, fecha text,marca text,modelo text, bolso text,EquipoEncaja text," +
                " cargador text ,ManualEnCaja text,GarantiaEnCaja text,EnciendeCargaSo text," +
                "MonitorPoblemas text,AudioProblemas text,TouchPadProblemas text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
