package com.rishabhkohli.rickandmorty.screens.characterslist

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.rishabhkohli.rickandmorty.entities.PartialCharacter


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
	CharactersListScreen(emptyList(), actioner = {})
}

@Composable
fun CharactersListScreen(characters: List<PartialCharacter>, actioner: (CharactersListAction) -> Unit) {
	LazyColumnFor(
		items = characters,
		modifier = Modifier
			.fillMaxSize()
			.padding(8.dp)
	) {
		characterItem(character = it)
	}
}

@Composable
private fun characterItem(character: PartialCharacter) {
	Text(
		text = character.name,
		modifier = Modifier.fillMaxWidth()
	)
}