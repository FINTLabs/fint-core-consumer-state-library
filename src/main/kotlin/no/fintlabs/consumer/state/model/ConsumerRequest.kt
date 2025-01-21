package no.fintlabs.consumer.state.model

import no.fintlabs.consumer.state.interfaces.ConsumerFields
import no.fintlabs.consumer.state.interfaces.ConsumerIdentificator

data class ConsumerRequest(
    override val domain: String,
    override val `package`: String,
    override val managed: Boolean,
    override val version: String,
    override val org: String,
    override val podResources: PodResources,
    override val resources: List<String>,
    override val writeableResources: List<String>,
    override val cacheDisabledResources: List<String>,
) : ConsumerIdentificator, ConsumerFields
