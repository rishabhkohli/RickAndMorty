package com.rishabhkohli.rickandmorty.screens.characterslist

import android.os.Bundle
import androidx.compose.ui.platform.ComposeView
import com.rishabhkohli.rickandmorty.entities.Character
import com.rishabhkohli.rickandmorty.screens.BaseComposeFragment
import com.rishabhkohli.rickandmorty.ui.RickAndMortyTheme

class CharactersListFragment : BaseComposeFragment() {

	override fun onViewCreated(composeView: ComposeView, savedInstanceState: Bundle?) {
		composeView.setContent {
			RickAndMortyTheme {
				CharactersListScreen(listOf(Character("Rick"), Character("Morty"))) {}
			}
		}
	}
}