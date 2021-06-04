package com.example.lastfmuselessapp.domain.repository

import com.example.lastfmuselessapp.domain.model.Artist
import com.example.lastfmuselessapp.domain.model.Resource

interface ArtistRepository {

    suspend fun getTopArtists(numberOfTopArtists: Int): Resource<List<Artist>>
}
