package com.example.myarsitektur



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyArsitekturTheme {
                SiswaApp()
            }
        }
    }
}
