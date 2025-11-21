package com.example.myarsitektur.view.uicontroller


enum class Navigasi {
    Formulir,
    Detail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaApp(
    //edit 1 : parameter viewModel
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Scaffold { isiRuang ->
        //edit 2 : Tambahkan variabel uiState
        val uiState = viewModel.statusUI.collectAsState()
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,

            modifier = Modifier.padding(paddingValues = isiRuang)
        ) {
            Scaffold { isiRuang ->
                //edit 2 : Tambahkan variabel uiState
                val uiState = viewModel.statusUI.collectAsState()
                NavHost(
                    navController = navController,
                    startDestination = Navigasi.Formulir.name,

                    modifier = Modifier.padding(paddingValues = isiRuang)) {
                    composable(route = Navigasi.Formulir.name) {
                        //edit 3 : Tambahkan variable konteks
                        val konteks = LocalContext.current
                        FormSiswa(
                            pilihanJK = DataJK.JenisJK,
                            onSubmitButtonClicked = {
                                viewModel.setSiswa(it)
                                navController.navigate(route = Navigasi.Detail.name)
                            }
                        )
                    }
                    composable(route = Navigasi.Detail.name) {
                        TampilSiswa(
                            //edit 5 : parameter statusUiSiswa
                            statusUISiswa = uiState.value,
                            onBackButtonClicked = { cancelAndBackToFormulir(navController) }
                        )
                    }
                }
            }
        }




