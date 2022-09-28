package com.example.notes.feature_notelist.domain.utils

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
