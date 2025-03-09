package com.example.microblogging;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

// Ajoutez l'importation de LoginActivity
import com.example.microblogging.LoginActivity.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Démarrer directement la page de connexion au lancement
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);   // Démarrer LoginActivity
        finish(); // Terminer MainActivity pour éviter le retour vers elle
    }
}
