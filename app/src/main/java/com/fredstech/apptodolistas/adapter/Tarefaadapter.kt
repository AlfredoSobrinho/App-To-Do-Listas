package com.fredstech.apptodolistas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fredstech.apptodolistas.R
import com.fredstech.apptodolistas.model.Tarefa

class Tarefaadapter : RecyclerView.Adapter<Tarefaadapter.tarefaViewHolder>() {

    private var listatarefas = emptyList<Tarefa>()
    class tarefaViewHolder(view: View) : RecyclerView.ViewHolder(view){




        val textnome=view.findViewById<TextView>(R.id.textnome)
        val textdescricao=view.findViewById<TextView>(R.id.textdescricao)
        val textresponsavel=view.findViewById<TextView>(R.id.textresponsavel)
        val textdata=view.findViewById<TextView>(R.id.textdata)
        val textcategoria=view.findViewById<TextView>(R.id.textcategoria)
        val suwitchcard=view.findViewById<Switch>(R.id.switchcard)
        val buttondeletar=view.findViewById<Button>(R.id.buttondeletar)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tarefaViewHolder {

      val layout = LayoutInflater.from(parent.context)
          .inflate(R.layout.card_layout_tarefa, parent, false)

        return tarefaViewHolder(layout)
    }

    override fun onBindViewHolder(holder: tarefaViewHolder, position: Int) {
        val tarefa = listatarefas[position]

        holder.textnome.text=tarefa.nome
        holder.textdescricao.text=tarefa.descricao
        holder.textresponsavel.text=tarefa.responsavel
        holder.textdata.text=tarefa.data
        holder.textcategoria.text=tarefa.categoria
        holder.suwitchcard.isChecked=tarefa.status


    }

    override fun getItemCount(): Int {

        return listatarefas.size

    }

    fun setlista(lista: List<Tarefa>){


     listatarefas= lista

        notifyDataSetChanged()


    }

}