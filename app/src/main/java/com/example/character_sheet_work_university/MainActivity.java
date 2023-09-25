package com.example.character_sheet_work_university;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView name;
    private TextView raca;
    private TextView forca;
    private TextView destrez;
    private TextView consti;
    private TextView intel;
    private TextView vida;
    private TextView caris;
    private TextView sab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        raca = findViewById(R.id.raca);
        forca = findViewById(R.id.forca);
        destrez = findViewById(R.id.destreza);
        consti = findViewById(R.id.consti);
        intel = findViewById(R.id.inteli);
        vida = findViewById(R.id.vida);
        caris = findViewById(R.id.caris);
        sab = findViewById(R.id.sab);
    }

    @SuppressLint("SetTextI18n")
    public void gerarPersonagem(View view){
        Random random = new Random(System.currentTimeMillis());
        String[] nomes = {"Paulo", "Thelbara", "Pereira", "Cleiton", "Baragwin", "Kharra", "Amamund", "Sahal", "Terbur", "Wenegar", "Khazras", "Elmara"};
        String[] racas = {"Humano", "Anão", "Elfo", "Meio Gigante"};

        name.setText("Nome: "+nomes[random.nextInt(12)]);
        raca.setText("Raça: "+racas[random.nextInt(4)]);

        double forcas = random.nextInt(6);
        double destrezz = random.nextInt(6);
        double constit = random.nextInt(6);
        double inteli = random.nextInt(6);
        double cariss = random.nextInt(6);
        double sabe = random.nextInt(6);

        if(raca.toString().equals("Anão")){
            constit += 1;
        }
        else if (raca.toString().equals("Elfo")){
            destrezz += 1;
        }
        else if (raca.toString().equals("Meio Gigante")){
            constit += 2;
            cariss -= 1;
        }

        forca.setText("Força: "+ forcas);
        destrez.setText("Destreza: "+destrezz);
        consti.setText("Constituição: "+constit);
        intel.setText("Inteligencia: "+inteli);
        caris.setText("Carisma: "+cariss);
        sab.setText("Sabedoria: "+sabe);

        double pontosVida = cariss * 3.5;
        vida.setText("Pontos de Vida: "+pontosVida);
    }

}