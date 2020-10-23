package com.rishabhkohli.rickandmorty.screens.main

sealed class MainAction {
	object CharactersClicked : MainAction()
	object EpisodesClicked : MainAction()
	object LocationsClicked : MainAction()
}