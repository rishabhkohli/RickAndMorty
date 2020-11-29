package com.rishabhkohli.rickandmorty.screens.characterslist

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.rishabhkohli.rickandmorty.entities.Character


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
	CharactersListScreen(listOf("ABC", "DEF", "GHI").map { Character(it) }, actioner = {})
}

@Composable
fun CharactersListScreen(characters: List<Character>, actioner: (CharactersListAction) -> Unit) {
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
private fun characterItem(character: Character) {
	Text(
		text = character.name,
		modifier = Modifier.fillMaxWidth()
	)
}