package com.example.microblogging.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.microblogging.repository.PostRepository;
import com.example.microblogging.models.Post;
import java.util.List;

public class PostViewModel extends ViewModel {
    private PostRepository postRepository;

    public PostViewModel() {
        // Initialisation du repository
        postRepository = new PostRepository();
    }

    // Méthode pour obtenir les posts
    public List<Post> getPosts() {
        return postRepository.getPosts();
    }

    // Méthode pour ajouter un post
    public void addPost(Post post) {
        postRepository.addPost(post);
    }
}
