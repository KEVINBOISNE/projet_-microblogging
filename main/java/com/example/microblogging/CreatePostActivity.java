package com.example.microblogging;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.microblogging.models.Post;
import com.example.microblogging.viewmodel.PostViewModel;

public class CreatePostActivity extends AppCompatActivity {

    private PostViewModel postViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_post);

        postViewModel = new ViewModelProvider(this).get(PostViewModel.class);  // Initialiser le ViewModel

        EditText editTextPost = findViewById(R.id.editTextPost);
        Button btnPublish = findViewById(R.id.btnPublish);

        btnPublish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupérer le texte du formulaire
                String message = editTextPost.getText().toString();
                // Créer un nouveau post
                Post post = new Post("Utilisateur", message, "1 min");
                // Ajouter ce post via ViewModel
                postViewModel.addPost(post);
                finish();  // Fermer l'écran
            }
        });
    }
}
