package com.example.travelassistant.routings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelassistant.R;

import java.util.List;


public class AdapterForRoutings extends RecyclerView.Adapter<AdapterForRoutings.ViewHolder> {

    private static final String TAG = "log";
    public static List<ResursesForRoutings> resorsesForUniversList;
    private LayoutInflater inflater;
    private Context context;
    private OnNoteListener mOnNoteListener;

    public AdapterForRoutings(Context context, List<ResursesForRoutings> resorsesForUniversList, OnNoteListener onNoteListener){
        this.resorsesForUniversList = resorsesForUniversList;
        this.inflater = LayoutInflater.from(context);
        this.mOnNoteListener = onNoteListener;
    }


    @NonNull
    @Override
    public AdapterForRoutings.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_for_routes, parent, false);
        //view.setOnClickListener(mOnClickListener);
        return new ViewHolder(view, mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        ResursesForRoutings resorsesForUnivers = resorsesForUniversList.get(position);
        holder.textView.setText(resorsesForUnivers.getNameUnivers());
        //holder.imageView.setImageDrawable();

//        ((ViewHolder)holder).linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, Vus.class);
//                intent.putExtra("id", String.valueOf(resorsesForUniversList.get(position)));
//                context.startActivity(intent);
//            }
//        });

//        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, Vus.class);
//                intent.putExtra("id", String.valueOf(resorsesForUniversList.get(position)));
//                context.startActivity(intent);
//
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return resorsesForUniversList.size();
    }

    public interface OnNoteListener{
        void onNoteClick(int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        LinearLayout linearLayout;
        TextView textView;
        //ImageView imageView;
        OnNoteListener onNoteListener;
        ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);
            constraintLayout = itemView.findViewById(R.id.rootView);
            linearLayout = itemView.findViewById(R.id.linearLayout);
            linearLayout.setOnClickListener(this);
            textView = itemView.findViewById(R.id.routingName);
            //imageView = itemView.findViewById(R.id.imageView);
            this.onNoteListener = onNoteListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onNoteListener.onNoteClick(getAdapterPosition());
        }
    }
}
