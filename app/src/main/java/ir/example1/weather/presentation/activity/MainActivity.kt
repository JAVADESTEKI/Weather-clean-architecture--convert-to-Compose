package ir.example1.weather.presentation.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.core.view.WindowCompat
import dagger.hilt.android.AndroidEntryPoint
import ir.example1.weather.presentation.ui.screen.MainScreen
import ir.example1.weather.presentation.ui.screen.WeatherApp

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        val city = intent.let {
            val id = it.getLongExtra("id", 0L)
            val name = it.getStringExtra("name")
            val country = it.getStringExtra("country")
            val lat = it.getDoubleExtra("lat", 0.0)
            val lon = it.getDoubleExtra("lon", 0.0)
            val selectedAt = it.getLongExtra("selectedAt", 0L)
            val localName = it.getStringExtra("localName")
            if (name != null && country != null) {
                ir.example1.weather.domain.model.City(
                    id, name, country, lat, lon, selectedAt, localName
                )
            } else null
        }

        setContent {
            MaterialTheme(
                colorScheme = darkColorScheme()
            ) {
                WeatherApp(cityToSave = city)
            }
        }
    }
}