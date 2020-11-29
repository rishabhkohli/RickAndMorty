package com.rishabhkohli.rickandmorty.network

import com.apollographql.apollo.ApolloClient
import com.apollographql.apollo.coroutines.await
import com.rishabhkohli.rickandmorty.entities.PartialCharacter
import com.rishabhkohli.rickandmorty.queries.GetAllCharactersQuery

object Network {

	private val apolloClient: ApolloClient = ApolloClient.builder()
		.serverUrl("https://rickandmortyapi.com/graphql/")
		.build()

	suspend fun getAllCharacters(): List<PartialCharacter> {
		val response = apolloClient.query(GetAllCharactersQuery()).await()
		val results = response.data?.characters?.results ?: emptyList()
		return results.filterNotNull().map { PartialCharacter(it.id!!, it.name!!, it.species!!, it.image!!) }
	}
}