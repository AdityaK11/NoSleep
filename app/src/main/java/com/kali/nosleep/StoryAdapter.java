package com.kali.nosleep;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder>  {

    Context context;
    List<Story> MainImageUploadInfoList;

    public StoryAdapter(Context context, List<Story> TempList) {
        this.MainImageUploadInfoList = TempList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_stories, parent, false);

        final ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        final Story Story = MainImageUploadInfoList.get(position);

        holder.read.setText(Story.getReadtime());
        holder.author.setText(Story.getAuthor());
        holder.title.setText(Story.getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, StoryActivity.class);
                i.putExtra("title",Story.getTitle());
                i.putExtra("author",Story.getAuthor());
                i.putExtra("story",Story.getStory());
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return MainImageUploadInfoList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public TextView author;
        public TextView read;

        public ViewHolder(View StoryView) {

            super(StoryView);
            title = (TextView) StoryView.findViewById(R.id.title_story);
            author = (TextView) StoryView.findViewById(R.id.author_story);
            read = (TextView) StoryView.findViewById(R.id.readTime_story);
        }
    }
}

