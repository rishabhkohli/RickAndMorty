package com.rishabhkohli.rickandmorty.screens.characterslist

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rishabhkohli.rickandmorty.entities.PartialCharacter


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
	CharactersListScreen(emptyList(), actioner = {})
}

@Composable
fun CharactersListScreen(characters: List<PartialCharacter>, actioner: (CharactersListAction) -> Unit) {
	LazyColumn(
		modifier = Modifier
			.fillMaxSize()
			.padding(8.dp)
	) {
		items(characters) {
			CharacterItem(character = it)
		}
	}
}

@Composable
private fun CharacterItem(character: PartialCharacter) {
	Text(
		text = character.name,
		modifier = Modifier.fillMaxWidth()
	)
}