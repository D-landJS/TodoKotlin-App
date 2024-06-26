package com.dlandev.todoapp

sealed class TaskCategory(var isSelect: Boolean = true) {
    data object Personal : TaskCategory()
    data object Business : TaskCategory()
    data object Other : TaskCategory()
}