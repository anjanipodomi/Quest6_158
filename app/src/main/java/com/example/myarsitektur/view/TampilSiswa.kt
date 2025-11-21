package com.example.myarsitektur.view


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUISiswa: Siswa,
    onBackButtonClicked: () -> Unit
) {
    val items = listOf(
        Pair(stringResource(id = R.string.nama), statusUISiswa.nama),
        Pair(stringResource(id = R.string.gender), statusUISiswa.gender),
        Pair(stringResource(id = R.string.alamat), statusUISiswa.alamat)
    )

}