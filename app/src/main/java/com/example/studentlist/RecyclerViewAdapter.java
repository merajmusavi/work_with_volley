package com.example.studentlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {
    private List<DataPOJO> dataPOJOS;
    private Context context;

    public RecyclerViewAdapter(List<DataPOJO> dataPOJOS, Context context) {
        this.dataPOJOS = dataPOJOS;
        this.context = context;
    }
    class viewHolder extends RecyclerView.ViewHolder {
        TextView first_char;
        TextView id;
        TextView name;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            first_char = itemView.findViewById(R.id.tv_first_char);
            id = itemView.findViewById(R.id.tv_score);
            name = itemView.findViewById(R.id.tv_full_name);
        }

        public void setFirst_char(String first_char_string) {
            first_char.setText(first_char_string);
        }

        public void setName(String name_string) {
            name.setText(name_string);
        }

        public void setId(String id_string){
            id.setText(id_string);
        }
    }
    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.setId(String.valueOf(dataPOJOS.get(position).getId()));
        holder.setName(dataPOJOS.get(position).getFirst_name());
        holder.setFirst_char(dataPOJOS.get(position).getFirst_name().substring(0,1));
    }

    @Override
    public int getItemCount() {
        return dataPOJOS.size();
    }


}
