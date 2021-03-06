package com.rishabhkohli.rickandmorty.screens.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
	MainScreen(actioner = {})
}

@Composable
fun MainScreen(actioner: (MainAction) -> Unit) {
	Column(
		modifier = Modifier
			.fillMaxSize()
			.padding(8.dp)
	) {
		OptionCard(text = "Characters") { actioner(MainAction.CharactersClicked) }
		Spacer(modifier = Modifier.height(8.dp))
		OptionCard(text = "Episodes") { actioner(MainAction.EpisodesClicked) }
		Spacer(modifier = Modifier.height(8.dp))
		OptionCard(text = "Locations") { actioner(MainAction.LocationsClicked) }
	}
}

@Composable
private fun ColumnScope.OptionCard(text: String, onClick: () -> Unit) {
	Card(
		modifier = Modifier
			.weight(1f)
			.fillMaxWidth()
			.clickable(onClick = onClick),
		elevation = 10.dp
	) {
		Box {
			Text(
				text = text,
				fontSize = 20.sp,
				modifier = Modifier.align(Alignment.Center)
			)
		}
	}
}