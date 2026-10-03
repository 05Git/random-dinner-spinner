package com.example.randdinner.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface DataRepository {
  val data: Flow<List<String>>
}

val DinnerItems: List<String> = listOf(
  "Spag bol",
  "Noodles",
  "炒饭",
  "Pizza",
  "Gyoza"
)

class DefaultDataRepository : DataRepository {
  override val data: Flow<List<String>> = flow { emit(DinnerItems) }
}
