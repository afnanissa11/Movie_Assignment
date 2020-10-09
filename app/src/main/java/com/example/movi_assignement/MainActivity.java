package com.example.movi_assignement;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.movi_assignement.model.InterfaceMoviData;
import com.example.movi_assignement.model.Movi;
//import com.example.movi_assignement.model.MoviData;
import com.example.movi_assignement.model.MoviFactory;

import java.text.BreakIterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1, spinner2, spinner;
    ImageButton androidImageButton;
    EditText textedit;
    EditText textedit1;
    EditText textedit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textedit = findViewById(R.id.textedit);

        textedit1 = findViewById(R.id.textedit1);
        textedit3 = findViewById(R.id.textedit3);


        spinner = findViewById(R.id.spinnername);
        spinner1 = findViewById(R.id.spinneryear);
        spinner2 = findViewById(R.id.spinnercategory);
        popularspinner();
        popularspinner1();
        popularspinner2();


    }

    private void popularspinner2() {
        MoviFactory factory = new MoviFactory();
        InterfaceMoviData objMovi = factory.GetModel();

        String[] cat = objMovi.getCategories();
        ArrayAdapter<String> adapter1 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, cat);
        spinner2.setAdapter(adapter1);

    }


    private void popularspinner1() {
        MoviFactory factory = new MoviFactory();
        InterfaceMoviData objmovies = factory.GetModel();
        String[] years = objmovies.getyears();
        ArrayAdapter<String> adapter0 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, years);
        spinner1.setAdapter(adapter0);


    }

    private void popularspinner() {
        MoviFactory factory = new MoviFactory();
        InterfaceMoviData objmovies = factory.GetModel();
        String[] name = objmovies.getnames();
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, name);
        spinner.setAdapter(adapter2);
    }





    public void ByName(View view) {
        MoviFactory factory = new MoviFactory();
        InterfaceMoviData objMovies = factory.GetModel();

        String item = "";

        item = spinner.getSelectedItem().toString();
        List<Movi> Movie = objMovies.getMoviesname(item);



        for (Movi a : Movie) {
            item += "," + a.getYear() + "," + a.getCategory() + "\n";

            textedit.setText(item);


        }
    }

    public void ByCategory(View view) {

            MoviFactory factory= new MoviFactory();
            InterfaceMoviData objMovies= factory.GetModel();
            String item="";
            item =spinner2.getSelectedItem().toString();
            List<Movi> Movie=objMovies.getMoviescategory(item);

            for (Movi a:Movie){
                item+=a.getName()+" - "+a.getYear()+" - "+a.getCategory()+"\n";

                textedit.setText(item);



            }

            // Toast.makeText(this,item,Toast.LENGTH_SHORT).show();

        }

    public void ByYear(View view) {
        MoviFactory factory = new MoviFactory();
        InterfaceMoviData objMovies = factory.GetModel();

        String i = "";

        i= spinner1.getSelectedItem().toString();
        List<Movi> Movie = objMovies.getMoviesyear(i);


        for (Movi a : Movie) {
            i += "," + a.getName() + "\n";

         //  textedit1.setText(i);

        }


    }}