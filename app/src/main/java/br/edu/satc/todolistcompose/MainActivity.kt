package br.edu.satc.todolistcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.mutableStateListOf
import br.edu.satc.todolistcompose.data.TaskData
import br.edu.satc.todolistcompose.ui.screens.HomeScreen
import br.edu.satc.todolistcompose.ui.theme.ToDoListComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ToDoListComposeTheme {
                HomeScreen()
            }
        }
    }
}

var mockTaskData = mutableStateListOf(
    TaskData(1, "Comprar pão", "Comprar pão na padaria", false),
    TaskData(2, "Estudar Kotlin", "Estudar Kotlin para o curso de Android", true),
    TaskData(3, "Ler um livro", "Ler o livro 'Clean Code'", false),
    TaskData(4, "Fazer exercícios", "Fazer exercícios físicos por 30 minutos", true),
    TaskData(5, "Assistir série", "Assistir a série 'Stranger Things'", false),
    TaskData(6, "Cozinhar", "Cozinhar o jantar para a família", false)
)