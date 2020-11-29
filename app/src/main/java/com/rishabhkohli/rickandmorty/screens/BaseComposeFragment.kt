package com.rishabhkohli.rickandmorty.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

abstract class BaseComposeFragment : Fragment() {

	final override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
		ComposeView(requireContext())

	final override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		onViewCreated(view as ComposeView, savedInstanceState)
	}

	abstract fun onViewCreated(composeView: ComposeView, savedInstanceState: Bundle?)

	fun requireComposeView(): ComposeView = super.requireView() as ComposeView
	val composeView: ComposeView? get() = super.getView() as ComposeView?
}