package com.example.kokomputer.data.model
import java.util.UUID

data class Category(
    var id: String = UUID.randomUUID().toString(),
    var name: String,
    var imgUrl: String
)