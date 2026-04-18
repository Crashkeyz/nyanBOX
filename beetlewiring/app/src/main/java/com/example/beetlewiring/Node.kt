package com.example.beetlewiring

data class Node(
    val id: String,
    val type: NodeType,
    val state: NodeState = NodeState()
)
