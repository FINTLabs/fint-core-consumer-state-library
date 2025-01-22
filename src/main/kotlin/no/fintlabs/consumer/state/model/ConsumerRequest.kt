package no.fintlabs.consumer.state.model

import no.fintlabs.consumer.state.interfaces.ConsumerFields
import no.fintlabs.consumer.state.interfaces.ConsumerIdentificator

data class ConsumerRequest(
    override val domain: String,
    override val `package`: String,
    override val managed: Boolean = true,
    override val version: String,
    override val org: String,
    override val podResources: PodResources = PodResources(),
    override val resources: List<String> = listOf(),
    override val writeableResources: List<String> = listOf(),
    override val cacheDisabledResources: List<String> = listOf(),
) : ConsumerIdentificator, ConsumerFields
