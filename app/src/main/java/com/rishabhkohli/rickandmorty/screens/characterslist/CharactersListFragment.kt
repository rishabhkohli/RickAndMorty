package com.rishabhkohli.rickandmorty.screens.characterslist

import android.os.Bundle
import androidx.compose.ui.platform.ComposeView
import androidx.lifecycle.lifecycleScope
import com.rishabhkohli.rickandmorty.network.Network
import com.rishabhkohli.rickandmorty.screens.BaseComposeFragment
import com.rishabhkohli.rickandmorty.ui.RickAndMortyTheme
import kotlinx.coroutines.launch

class CharactersListFragment : BaseComposeFragment() {

	override fun onViewCreated(composeView: ComposeView, savedInstanceState: Bundle?) {
		lifecycleScope.launch {
			val characters = Network.getAllCharacters()
			composeView.setContent {
				RickAndMortyTheme {
					CharactersListScreen(characters) {}
				}
			}
		}
	}
}