package pe.edu.upc.todo.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.upc.todo.ui.theme.ToDoTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopAppBar() {

            }
        }) {
            Tasks()

    }
}

@Composable
fun Tasks() {
    LazyColumn (modifier = Modifier.fillMaxSize()){
        item {
            Text(text = "First item")
        }
        items(50) {index ->
            Text(text = "Item: $index")
        }
    }
}

@Composable
fun Contacts() {
    var names = ArrayList<String>()
    names.add("Enrique")
    names.add("Juan")
    names.add("Erika")

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(names) {name ->
            Text(text = "My name is $name")

        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ToDoTheme {
        //Tasks()
        //Contacts()
        MainScreen()
    }
}