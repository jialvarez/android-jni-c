package blog.neonigma;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import src.blog.neonigma.R;

public class AndroidActivity extends Activity {

    static {
        System.loadLibrary("mixed_sample");
    }

    private Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        context = this;

        String greeting = SayHello("neonigma");

        Saludo saludo = new Saludo(greeting);
        Saludar.enviarSaludo(context, saludo);
    }

    public native String SayHello(String name);
}