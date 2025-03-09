package com.example.microblogging.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.BaseAdapter;

import com.example.microblogging.R;
import com.example.microblogging.models.Post;

import java.util.List;

public class PostAdapter extends BaseAdapter {
    private Context context;
    private List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @Override
    public int getCount() {
        return postList.size();
    }

    @Override
    public Object getItem(int position) {
        return postList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_post, parent, false);
        }

        Post post = postList.get(position); // Récupérer l'objet Post

        TextView textViewAuthor = convertView.findViewById(R.id.textViewAuthor);
        TextView textViewContent = convertView.findViewById(R.id.textViewContent);
        TextView textViewTimestamp = convertView.findViewById(R.id.textViewTimestamp);

        textViewAuthor.setText(post.getUsername()); // Utilisation de getUsername()
        textViewContent.setText(post.getMessage()); // Utilisation de getMessage()
        textViewTimestamp.setText(post.getTimestamp());

        return convertView;
    }
}
