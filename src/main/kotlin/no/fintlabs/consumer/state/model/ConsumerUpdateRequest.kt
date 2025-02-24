package no.fintlabs.consumer.state.model

import no.fintlabs.consumer.state.interfaces.ConsumerFields

data class ConsumerUpdateRequest(
    override val version: String?,
    override val shared: Boolean?,
    override val limitsCpu: String?,
    override val limitsMemory: String?,
    override val requestsCpu: String?,
    override val requestsMemory: String?,
    override val resources: List<String>?,
    override val writeableResources: List<String>?,
    override val cacheDisabledResources: List<String>?
) : ConsumerFields
