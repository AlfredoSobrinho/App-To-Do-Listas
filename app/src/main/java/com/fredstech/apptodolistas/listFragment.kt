package com.fredstech.apptodolistas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fredstech.apptodolistas.adapter.Tarefaadapter
import com.fredstech.apptodolistas.model.Tarefa


class listFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_list, container, false)


        val listatarefas = mutableListOf(

            Tarefa(
                "Correr no parque",
               "Iniciar de manhã",
                "Alfredo",
                "25/04/2022",
                false,
            "Laser",),

                    Tarefa(
                    "Tocar Violão",
            "Iniciar de Noite",
            "Alfredo",
            "24/03/2022",
            true,
            "Laser",),

            Tarefa(
                "Estudar Redes de Computadores",
                "Iniciar de manhã",
                "Alfredo",
                "22/03/2022",
                true,
                "Estudos",),

            Tarefa(
                "Estudar Pen test",
                "Iniciar de manhã",
                "Alfredo",
                "23/03/2022",
                true,
                "Estudos"
            )
        )

        val recyclertarefa = view.findViewById<RecyclerView>(R.id.recycletarefa)

    val adapter = Tarefaadapter()

        recyclertarefa.layoutManager = LinearLayoutManager(context)

        recyclertarefa.adapter = adapter

         recyclertarefa.setHasFixedSize(true)


          adapter.setlista(listatarefas)
        return view

    }
}
