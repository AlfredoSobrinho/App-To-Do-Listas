package com.fredstech.apptodolistas.model

data class Tarefa (

    val nome: String,
    val descricao: String,
    val responsavel: String,
    val data: String,
    val status: Boolean,
    val categoria: String,
    ){
}