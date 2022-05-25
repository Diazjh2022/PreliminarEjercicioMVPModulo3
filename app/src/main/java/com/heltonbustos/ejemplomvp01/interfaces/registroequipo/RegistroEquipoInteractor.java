package com.heltonbustos.ejemplomvp01.interfaces.registroequipo;
import android.content.Context;

import com.heltonbustos.ejemplomvp01.presenter.registroequipo.RegistroEquipoPresenterImpl;

public interface RegistroEquipoInteractor {
    void registrar(String codigo, String nombre, String fecha,String marca,String modelo,
                   String bolso, String EquipoEnCaja,String cargador,String ManualEnCaja ,
                   String GarantiaEnCaja, String EnciendeCargaSo ,String MonitorProblemas , String AudioProblemas,String TouchPadProblemas,


                   RegistroEquipoPresenterImpl presenter, Context contexto);
}
