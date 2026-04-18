package com.example.beetlewiring

data class NodeState(
    val blown: Boolean = false,
    val on: Boolean = false,
    val extra: Map<String, Any> = emptyMap()
)
