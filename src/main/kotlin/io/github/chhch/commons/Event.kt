package io.github.chhch.commons

interface Event<in Any> {

    fun fire(event: Any)

}