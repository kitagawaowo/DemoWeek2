package pe.edu.upc.todo.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import pe.edu.upc.todo.ui.theme.ToDoTheme

@Composable
fun Tasks() {
    LazyColumn (modifier = Modifier.fillMaxSize()){
        item {
            Text(text = "First item")
        }
        items(5) {index ->
            Text(text = "Item: $index")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ToDoTheme() {
        Tasks()
    }
}