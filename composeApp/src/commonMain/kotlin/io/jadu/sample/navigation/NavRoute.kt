package io.jadu.sample.navigation

import kotlinx.serialization.Serializable

sealed interface NavRoute {
    @Serializable
    data object Home : NavRoute

    @Serializable
    data object Tasks : NavRoute

    @Serializable
    data object Add : NavRoute

    @Serializable
    data object Calendar : NavRoute

    @Serializable
    data object Settings : NavRoute
}

