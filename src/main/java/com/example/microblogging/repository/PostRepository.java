package com.example.microblogging.repository;  // Choisissez le package dans lequel vous souhaitez garder cette classe.

import com.example.microblogging.models.Post;
import java.util.ArrayList;
import java.util.List;

public class PostRepository {

    private List<Post> postList;

    // Constructeur : Initialise la liste de posts et ajoute quelques données fictives
    public PostRepository() {
        postList = new ArrayList<>();
        // Ajouter des données fictives pour commencer
        postList.add(new Post("Alice", "Ceci est mon premier post !", "10 min"));
        postList.add(new Post("Bob", "Hello le monde 👋", "20 min"));
        postList.add(new Post("Charlie", "Premier jour de mon blog.", "1h"));
    }

    // Retourne la liste de posts
    public List<Post> getPosts() {
        return postList;
    }

    // Ajoute un nouveau post à la liste
    public void addPost(Post post) {
        postList.add(post);
    }

    // Vous pouvez ajouter d'autres méthodes si nécessaire pour rechercher, supprimer, ou modifier des posts
}
