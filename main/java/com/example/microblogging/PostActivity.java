package com.example.microblogging;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.microblogging.models.Post;
import com.example.microblogging.repository.PostRepository;
import com.example.microblogging.adapters.PostAdapter;

import java.util.List;

public class PostActivity extends AppCompatActivity {

    private EditText editTextNewPost;
    private Button buttonPublishPost;
    private ListView listViewPosts;
    private PostRepository postRepository;
    private PostAdapter postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        // Initialiser les vues
        editTextNewPost = findViewById(R.id.editTextNewPost);
        buttonPublishPost = findViewById(R.id.buttonPublishPost);
        listViewPosts = findViewById(R.id.listViewPosts);

        // Initialiser le repository des posts
        postRepository = new PostRepository();
        List<Post> postList = postRepository.getPosts();

        // Initialiser l'adaptateur pour afficher la liste des posts
        postAdapter = new PostAdapter(this, postList);
        listViewPosts.setAdapter(postAdapter);

        // Publier un nouveau post lorsque l'utilisateur clique sur "Publier"
        buttonPublishPost.setOnClickListener(v -> {
            String message = editTextNewPost.getText().toString().trim();

            if (message.isEmpty()) {
                Toast.makeText(PostActivity.this, "Le post ne peut pas être vide", Toast.LENGTH_SHORT).show();
            } else {
                // Ajouter le nouveau post
                Post newPost = new Post("Utilisateur", message, "à l'instant");
                postRepository.addPost(newPost);

                // Mettre à jour la liste des posts
                postAdapter.notifyDataSetChanged();

                // Effacer le champ de texte
                editTextNewPost.setText("");
            }
        });
    }
}
