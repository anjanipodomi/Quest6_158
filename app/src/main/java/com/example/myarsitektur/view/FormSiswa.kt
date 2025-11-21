package com.example.myarsitektur.view

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    pilihanJK: List<String>,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    modifier: Modifier = Modifier
) {
    var txtNama by rememberSaveable { mutableStateOf(value = "") }
    var txtAlamat by remember { mutableStateOf(value = "") }
    var txtGender by remember { mutableStateOf(value = "") }
    val listData: MutableList<String> = mutableListOf(txtNama, txtGender, txtAlamat)

    Scaffold (modifier=Modifier,
        topBar = {
            TopAppBar(
                title = {Text(text=stringResource(R.string.app_name), color =  Color.White)},)
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = colorResource(id = R.color.teal_700))
            )}
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = txtNama,
                singleLine = true,
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier
                    .width(width = 250.dp)
                    .padding(top = 20.dp),
                label = { Text(text = "Nama Lengkap") },
                onValueChange = {
                    txtNama = it
                }
        }
    }

}