package com.github.kotlin.everywhere.json.decode

sealed class Result<E, O>
data class Ok<E, O>(val data: O) : Result<E, O>() {
    companion object {
        fun <O> of(data: O): Ok<*, O> {
            return Ok<Any, O>(data)
        }
    }
}

data class Err<E, O>(val error: E) : Result<E, O>() {
    companion object {
        fun <E> of(error: E): Err<E, *> {
            return Err<E, Any>(error)
        }
    }
}
