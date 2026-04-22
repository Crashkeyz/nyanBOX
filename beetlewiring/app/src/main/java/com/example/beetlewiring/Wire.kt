package com.example.beetlewiring

data class Wire(
    val id: String,
    val fromNodeId: String,
    val toNodeId: String,
    val active: Boolean = false
)
