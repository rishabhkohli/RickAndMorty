package com.rishabhkohli.rickandmorty.screens.main

import android.os.Bundle
import android.widget.Toast
import androidx.compose.ui.platform.ComposeView
import com.rishabhkohli.rickandmorty.screens.BaseComposeFragment
import com.rishabhkohli.rickandmorty.ui.RickAndMortyTheme

class MainFragment : BaseComposeFragment() {

	override fun onViewCreated(composeView: ComposeView, savedInstanceState: Bundle?) {
		composeView.setContent {
			RickAndMortyTheme {
				MainScreen {
					Toast.makeText(requireContext(), "${it::class.simpleName} action was fired", Toast.LENGTH_SHORT).show()
				}
			}
		}
	}
}