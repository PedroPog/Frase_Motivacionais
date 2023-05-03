package com.aulas.frasemotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mudarFrases(View view){
        TextView textView;

        textView = findViewById(R.id.textView);
        String[]  frases = {"O fracasso é apenas uma oportunidade para recomeçar com mais sabedoria.",
                "Acredite em si mesmo e tudo será possível.",
                "Não espere por oportunidades, crie-as.",
                "A persistência é o caminho do êxito.",
                "Acredite que você pode e já está no meio do caminho.",
                "Nunca é tarde demais para ser quem você poderia ter sido.",
                "Não deixe que o medo de cair o impeça de voar.",
                "A mudança começa com a decisão de tentar.",
                "O sucesso é a soma de pequenos esforços repetidos dia após dia.",
                "Não desista, a vida pode surpreendê-lo quando você menos espera."};
        int n = new Random().nextInt(frases.length);

        textView.setText(frases[n]);
    }
}