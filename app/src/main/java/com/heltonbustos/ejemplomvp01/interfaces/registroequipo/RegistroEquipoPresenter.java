package com.heltonbustos.ejemplomvp01.interfaces.registroequipo;

import android.content.Context;

public interface RegistroEquipoPresenter {
    void registrar(String codigo, String nombre, String fecha,String marca,String modelo,
                   String bolso, String EquipoEnCaja,String cargador,String ManualEnCaja ,
                   String GarantiaEnCaja, String EnciendeCargaSo ,String MonitorProblemas , String AudioProblemas,String TouchPadProblemas, Context contexto);
    void exito();
    void error();
    void setErrorCodigo();
    void setErrorNombre();
    void setErrorMarca();
    void setErrorModelo();
}
