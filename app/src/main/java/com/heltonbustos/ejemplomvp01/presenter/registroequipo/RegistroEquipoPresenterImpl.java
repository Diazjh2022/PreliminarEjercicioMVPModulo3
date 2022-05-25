package com.heltonbustos.ejemplomvp01.presenter.registroequipo;

import android.content.Context;

import com.heltonbustos.ejemplomvp01.interactor.registroequipo.RegistroEquipoInteractorImpl;
import com.heltonbustos.ejemplomvp01.interfaces.registroequipo.RegistroEquipoInteractor;
import com.heltonbustos.ejemplomvp01.interfaces.registroequipo.RegistroEquipoPresenter;
import com.heltonbustos.ejemplomvp01.interfaces.registroequipo.RegistroEquipoView;

public class RegistroEquipoPresenterImpl implements RegistroEquipoPresenter {
    RegistroEquipoView vista;
    RegistroEquipoInteractor interactor;

    public RegistroEquipoPresenterImpl(RegistroEquipoView vista) {
        this.vista = vista;
        this.interactor = new RegistroEquipoInteractorImpl();
    }





    @Override
    public void registrar(String codigo, String nombre, String fecha, String marca, String modelo, String bolso, String EquipoEnCaja, String cargador, String ManualEnCaja, String GarantiaEnCaja, String EnciendeCargaSo, String MonitorProblemas, String AudioProblemas, String TouchPadProblemas, Context contexto) {

    }

    @Override
    public void exito() {
        vista.exito();
    }

    @Override
    public void error() {
        vista.error();
    }

    @Override
    public void setErrorCodigo() {
        vista.setErrorCodigo();
    }

    @Override
    public void setErrorNombre() {
        vista.setErrorNombre();
    }

    @Override
    public void setErrorMarca() {
        vista.setErrorMarca();

    }

    @Override
    public void setErrorModelo() {
        vista.setErrorModelo();

    }
}
