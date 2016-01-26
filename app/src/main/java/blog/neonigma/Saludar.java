package blog.neonigma;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by nacho on 12/1/16.
 */
public class Saludar {

    public static void enviarSaludo(Context context, Saludo saludo) {
        Toast.makeText(context, saludo.getMensajeSaludo(), Toast.LENGTH_LONG).show();
    }
}
