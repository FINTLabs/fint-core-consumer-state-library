package no.fintlabs.consumer.state.model

import no.fintlabs.consumer.state.interfaces.Consumer

data class ConsumerRequest(
    override val domain: String,
    override val `package`: String,
    override val version: String,
    override val org: String,
    override val shared: Boolean = false,
    override val podResources: PodResources = PodResources(),
    override val resources: List<String> = listOf(),
    override val writeableResources: List<String> = listOf(),
    override val cacheDisabledResources: List<String> = listOf(),
) : Consumer {
    companion object {
        fun fromConsumer(consumer: Consumer) = ConsumerRequest(
            consumer.domain,
            consumer.`package`,
            consumer.version,
            consumer.org,
            consumer.shared,
            consumer.podResources,
            consumer.resources,
            consumer.writeableResources,
            consumer.cacheDisabledResources,
        )
    }
}
