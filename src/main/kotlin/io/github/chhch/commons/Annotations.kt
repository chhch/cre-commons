package io.github.chhch.commons

@Target(AnnotationTarget.FUNCTION)
annotation class Start

@Target(AnnotationTarget.FUNCTION)
annotation class Stop

@Target(AnnotationTarget.CONSTRUCTOR, AnnotationTarget.PROPERTY)
annotation class Inject

@Target(AnnotationTarget.FUNCTION)
annotation class Observer

@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class EventQualifier

@Target(AnnotationTarget.CLASS)
annotation class Scope(val inject: Array<Lifecycle>)

enum class Lifecycle {
    UNDER_TEST, IN_PRODUCTION, UNDER_INSPECTION, IN_MAINTENANCE
}