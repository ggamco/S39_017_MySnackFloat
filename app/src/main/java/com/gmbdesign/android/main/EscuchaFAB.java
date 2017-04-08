package com.gmbdesign.android.main;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;

/**
 * Created by ggamboa on 8/4/17.
 */

public class EscuchaFAB implements View.OnClickListener {

    private int contador = 0;

    @Override
    public void onClick(View v) {

        //aqui vamos a llamar al snackbar
        Snackbar snackbar = Snackbar.make(v, "Se presionó el FAB "+ ++contador + " veces", Snackbar.LENGTH_LONG);
        snackbar.show();

        //añadimos un boton al snackbar
        snackbar.setAction("OK", this);
        snackbar.setActionTextColor(Color.MAGENTA);

        //metodo que ejecuta una accion al ocultarse
        snackbar.addCallback(new Snackbar.Callback(){
            @Override
            public void onShown(Snackbar sb) {
                super.onShown(sb);
                Log.d("TAG", "Se muestra onShown");
            }

            @Override
            public void onDismissed(Snackbar transientBottomBar, int event) {
                super.onDismissed(transientBottomBar, event);
                Log.d("TAG", "Se muestra onDismissed");
            }
        });


    }
}
