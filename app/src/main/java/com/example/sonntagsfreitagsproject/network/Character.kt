package com.example.sonntagsfreitagsproject.network

import com.squareup.moshi.Json

data class Character (

    var name: String,
    var image: String
)
data class CharacterResponse(@Json(name="results")val result :List<Character>)