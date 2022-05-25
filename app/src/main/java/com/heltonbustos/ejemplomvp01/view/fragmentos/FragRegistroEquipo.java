package com.heltonbustos.ejemplomvp01.view.fragmentos;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.heltonbustos.ejemplomvp01.R;
import com.heltonbustos.ejemplomvp01.interfaces.registroequipo.RegistroEquipoPresenter;
import com.heltonbustos.ejemplomvp01.interfaces.registroequipo.RegistroEquipoView;
import com.heltonbustos.ejemplomvp01.presenter.registroequipo.RegistroEquipoPresenterImpl;
import com.heltonbustos.ejemplomvp01.view.actividades.OtraActividad;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FragRegistroEquipo extends Fragment implements RegistroEquipoView {

    //Campos de texto del formulario
    TextView txtFecha;
    EditText  txtCodigo,txtNombre,txtMarca,txtModelo ,txtObservaciones;

    //switch bolso
    Switch swBolso;

    //radio para el cargador
    RadioButton rdSiEquipoEnCaja , rdNoEquipoEnCaja ,rdSiCargador ,rdNoCargador, rdSiManualEnCaja,rdNoManualEnCaja,
            rdSiGarantiaEnCaja, rdNoGarantiaEnCaja , rdSiEnciendeCargaSo,rdNoEnciendeCargaSo,rdSiMonitorProblemas,rdNoMonitorProblemas,
            rdSiAudioProblemas,rdNoAudioProblemas,rdSiTouchPadProblemas,rdNoTouchPadProblemas;

    //presentador MVP
    RegistroEquipoPresenter presenter;

    //variables para trabajar con los nombres de las fotos
    String f = "";

    //botones para tomar foto 1, foto 2 y registro
    Button btnFoto1, btnFoto2, btnRegistrarEquipo;

    //ImageView para fotos
    ImageView img1, img2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_registro_equipo, container, false);

        //campos de texto formulario
        txtFecha = v.findViewById(R.id.txtFechaIngreso);
        txtCodigo = v.findViewById(R.id.txtCodigoIngreso);
        txtNombre = v.findViewById(R.id.txtNombreIngreso);
        txtModelo = v.findViewById(R.id.txtModeloIngreso);
        txtMarca = v.findViewById(R.id.txtMarcaIngreso);
        txtObservaciones =v.findViewById(R.id.txtObservaciones);


        //switch
        swBolso = v.findViewById(R.id.swBolso);

        //radio cargador
        rdSiCargador = v.findViewById(R.id.rdSiCargador);
        rdNoCargador = v.findViewById(R.id.rdNoCargador);



        rdSiEquipoEnCaja  = v.findViewById(R.id.rdSiEquipoEnCaja );
        rdNoEquipoEnCaja  = v.findViewById(R.id.rdNoEquipoEnCaja );

        rdSiManualEnCaja  = v.findViewById(R.id.rdSiManualEnCaja );
        rdNoManualEnCaja  = v.findViewById(R.id.rdNoManualEnCaja );

        rdSiGarantiaEnCaja   = v.findViewById(R.id.rdSiGarantiaEnCaja );
        rdNoGarantiaEnCaja  = v.findViewById(R.id.rdNoGarantiaEnCaja );

        rdSiEnciendeCargaSo   = v.findViewById(R.id.rdSiEnciendeCargaSo );
        rdNoEnciendeCargaSo  = v.findViewById(R.id.rdNoEnciendeCargaSo );


        rdSiMonitorProblemas   = v.findViewById(R.id.rdSiMonitorProblemas );
        rdNoMonitorProblemas  = v.findViewById(R.id.rdNoMonitorProblemas );

        rdSiAudioProblemas   = v.findViewById(R.id.rdSiAudioProblemas );
        rdNoAudioProblemas  = v.findViewById(R.id.rdNoAudioProblemas );

        rdSiTouchPadProblemas   = v.findViewById(R.id.rdSiTouchPadProblemas );
        rdNoTouchPadProblemas  = v.findViewById(R.id.rdNoTouchpadProblemas );



















        //presentador
        presenter = new RegistroEquipoPresenterImpl(this);

        //para traer la fecha actual
        Calendar calendar = Calendar.getInstance(); // Returns instance with current date and time set
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        f = formatter.format(calendar.getTime());
        txtFecha.setText(f);

        //ImageView para fotos
        btnFoto1 = v.findViewById(R.id.btnFoto1);
        btnFoto2 = v.findViewById(R.id.btnFoto2);

        //btn para registrar
        btnRegistrarEquipo = v.findViewById(R.id.btnRegistrarEquipo);

        //ImageView para fotos
        img1 = v.findViewById(R.id.img1);
        img2 = v.findViewById(R.id.img2);

        btnFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((OtraActividad)getActivity()).permisosCamara1(img1);
            }
        });

        btnFoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((OtraActividad)getActivity()).permisosCamara2(img2);
            }
        });

        btnRegistrarEquipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                solicitarRegistro();
            }
        });

        return v;
    }

    @Override
    public void exito() {
        Toast.makeText(getContext(), "REGISTRO OK", Toast.LENGTH_SHORT).show();
        ((OtraActividad)getActivity()).permisosAlmacenamiento(txtCodigo.getText().toString());
    }

    @Override
    public void error() {
        Toast.makeText(getContext(), "No se pudo registrar", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setErrorCodigo() {
        txtCodigo.setError("Complete el campo código");
    }


    @Override
    public void setErrorNombre() {
        txtNombre.setError("Complete el campo nombre");
    }

    @Override
    public void setErrorModelo() {
        txtModelo.setError("Debe ingresarl el modelo del equipo");
    }

    @Override
    public void setErrorMarca() {
        txtMarca.setError("Debe ingresarl la marca del equipo");

    }


    public void solicitarRegistro(){
        String bolso = "NO";
        String cargador = "NO";

        String EquipoEnCaja= "NO";
        String ManualEnCaja = "NO";

        String GarantiaEnCaja= "NO";
        String EnciendeCargaSo = "NO";

        String MonitorProblemas= "NO";
        String AudioProblemas = "NO";

        String TouchPadProblemas= "NO";












        if(rdSiCargador.isChecked()){ cargador = "SI"; }
        if(swBolso.isChecked()){ bolso = "SI"; }

        if(rdSiEquipoEnCaja .isChecked()){ EquipoEnCaja = "SI"; }
        if(rdSiManualEnCaja  .isChecked()){ EquipoEnCaja = "SI"; }
        if(rdSiGarantiaEnCaja  .isChecked()){ EquipoEnCaja = "SI"; }
        if(rdSiEnciendeCargaSo  .isChecked()){ EquipoEnCaja = "SI"; }
        if(rdSiMonitorProblemas  .isChecked()){ EquipoEnCaja = "SI"; }
        if(rdSiAudioProblemas  .isChecked()){ EquipoEnCaja = "SI"; }
        if(rdSiTouchPadProblemas  .isChecked()){ EquipoEnCaja = "SI"; }








        presenter.registrar(txtCodigo.getText().toString(), txtNombre.getText().toString(),f,txtMarca.getText().toString(),txtModelo.getText().toString(), bolso,EquipoEnCaja, cargador,ManualEnCaja,GarantiaEnCaja,EnciendeCargaSo,MonitorProblemas,AudioProblemas,TouchPadProblemas, getContext());

    }



    public static void mostrarImagen(ImageView img, Bitmap bitmap){
        img.setImageBitmap(bitmap);
    }


}