package br.edu.satc.todolistcompose.data

data class TaskData (
    val id: Int = 0,
    val title: String,
    val description: String,
    val complete: Boolean
)