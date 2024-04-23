import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Preview
@Composable
fun Eje1() {
    Box(
        modifier = Modifier
            .fillMaxSize(),

        contentAlignment = Alignment.Center

    ) {
        Box(
            modifier = Modifier
                .background(Color.Cyan)
                .size(width = 40.dp, height = 40.dp),

            ) {}
    }
}

@Preview
@Composable
fun Eje2() {
    Box(
        modifier = Modifier
            .fillMaxSize(),

        contentAlignment = Alignment.Center

    ) {
        Box(
            modifier = Modifier
                .background(Color.Cyan)
                .size(width = 300.dp, height = 200.dp)
                .padding(vertical = 20.dp),

            contentAlignment = Alignment.BottomCenter

        ) {
            Text(
                text = "Esto es un EJEMPLO del uso de Box ",

                )
        }
    }
}

@Preview
@Composable
fun Eje3() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            color = Color.Red,
            modifier = Modifier.size(width = 70.dp, height = 150.dp)
        ) {
            Text(text = "Ejemplo 1")
        }
        Surface(
            color = Color.Gray,
            modifier = Modifier.size(width = 70.dp, height = 300.dp)
        ) {
            Text(text = "Ejemplo 2")
        }
        Surface(
            color = Color.Cyan,
            modifier = Modifier.size(width = 70.dp, height = 300.dp)
        ) {
            Text(text = "Ejemplo 3")
        }
        Surface(
            color = Color.Green,
            modifier = Modifier.size(width = 70.dp, height = 170.dp)
        ) {
            Text(text = "Ejemplo 4")
        }
    }
}


@Preview
@Composable
fun Eje4() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier.background(Color.Red).padding(all = 10.dp)
        )
        Surface(
            color = Color.White,
            modifier = Modifier.size(width = 70.dp, height = 150.dp)
        ) {
            Text(text = "Ejemplo 1")
        }
    }
}


fun main() = application {
    val windowState = rememberWindowState(size = DpSize(1200.dp, 800.dp))

    Window(
        onCloseRequest = ::exitApplication,
        state = windowState
    ) {
        Eje2()
    }
}
