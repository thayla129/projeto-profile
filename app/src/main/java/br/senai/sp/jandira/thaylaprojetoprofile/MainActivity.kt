package br.senai.sp.jandira.thaylaprojetoprofile


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import br.senai.sp.jandira.thaylaprojetoprofile.ui.theme.ThaylaProjetoProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThaylaProjetoProfileTheme {
                Surface(color = Color(0xFFF5F5F5)) {
                    ProfileScreen()
                }
            }
        }
    }
}
