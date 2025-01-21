package no.fintlabs.consumer.state.model

import no.fintlabs.consumer.state.interfaces.ConsumerFields

data class ConsumerUpdateRequest(
    override val version: String,
    override val managed: Boolean,
    override val resources: List<String>,
    override val podResources: PodResources,
    override val writeableResources: List<String>,
    override val cacheDisabledResources: List<String>
) : ConsumerFields
