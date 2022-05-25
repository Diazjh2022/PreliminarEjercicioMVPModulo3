package com.heltonbustos.ejemplomvp01.interactor.test;



public class RegistroEquipoModelo {


    private String codigo;
    private String nombre;
    private String fecha;
    private String marca;
    private String modelo;
    private String bolso;
    private String EquipoEnCaja;
    private String cargador;
    private String ManualEnCaja;
    private String GarantiaEnCaja;
    private String EnciendeCargaSo;
    private String MonitorPoblemas;
    private String AudioProblemas;
    private String TouchPadProblemas;

    public RegistroEquipoModelo(String codigo, String nombre, String fecha, String marca, String modelo, String bolso, String equipoEnCaja, String cargador, String manualEnCaja, String garantiaEnCaja, String enciendeCargaSo, String monitorPoblemas, String audioProblemas, String touchPadProblemas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.marca = marca;
        this.modelo = modelo;
        this.bolso = bolso;
        EquipoEnCaja = equipoEnCaja;
        this.cargador = cargador;
        ManualEnCaja = manualEnCaja;
        GarantiaEnCaja = garantiaEnCaja;
        EnciendeCargaSo = enciendeCargaSo;
        MonitorPoblemas = monitorPoblemas;
        AudioProblemas = audioProblemas;
        TouchPadProblemas = touchPadProblemas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getBolso() {
        return bolso;
    }

    public void setBolso(String bolso) {
        this.bolso = bolso;
    }

    public String getEquipoEnCaja() {
        return EquipoEnCaja;
    }

    public void setEquipoEnCaja(String equipoEnCaja) {
        EquipoEnCaja = equipoEnCaja;
    }

    public String getCargador() {
        return cargador;
    }

    public void setCargador(String cargador) {
        this.cargador = cargador;
    }

    public String getManualEnCaja() {
        return ManualEnCaja;
    }

    public void setManualEnCaja(String manualEnCaja) {
        ManualEnCaja = manualEnCaja;
    }

    public String getGarantiaEnCaja() {
        return GarantiaEnCaja;
    }

    public void setGarantiaEnCaja(String garantiaEnCaja) {
        GarantiaEnCaja = garantiaEnCaja;
    }

    public String getEnciendeCargaSo() {
        return EnciendeCargaSo;
    }

    public void setEnciendeCargaSo(String enciendeCargaSo) {
        EnciendeCargaSo = enciendeCargaSo;
    }

    public String getMonitorPoblemas() {
        return MonitorPoblemas;
    }

    public void setMonitorPoblemas(String monitorPoblemas) {
        MonitorPoblemas = monitorPoblemas;
    }

    public String getAudioProblemas() {
        return AudioProblemas;
    }

    public void setAudioProblemas(String audioProblemas) {
        AudioProblemas = audioProblemas;
    }

    public String getTouchPadProblemas() {
        return TouchPadProblemas;
    }

    public void setTouchPadProblemas(String touchPadProblemas) {
        TouchPadProblemas = touchPadProblemas;
    }
}

