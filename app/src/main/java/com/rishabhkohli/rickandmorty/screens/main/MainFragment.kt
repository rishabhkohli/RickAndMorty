package com.rishabhkohli.rickandmorty.screens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import com.rishabhkohli.rickandmorty.ui.RickAndMortyTheme

class MainFragment : Fragment() {

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
		ComposeView(requireContext()).apply {
			setContent {
				RickAndMortyTheme {
					MainScreen {
						Toast.makeText(requireContext(), "${it::class.simpleName} was clicked", Toast.LENGTH_SHORT).show()
					}
				}
			}
		}
}