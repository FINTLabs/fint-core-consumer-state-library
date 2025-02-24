package no.fintlabs.consumer.state.model

import no.fintlabs.consumer.state.interfaces.Consumer

data class ConsumerRequest(
    override val domain: String,
    override val `package`: String,
    override val version: String,
    override val org: String,
    override val shared: Boolean = false,
    override val limitsCpu: String = "500m",
    override val limitsMemory: String = "512Mi",
    override val requestsCpu: String = "100m",
    override val requestsMemory: String = "128Mi",
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
            consumer.limitsCpu,
            consumer.limitsMemory,
            consumer.requestsCpu,
            consumer.requestsMemory,
            consumer.resources,
            consumer.writeableResources,
            consumer.cacheDisabledResources
        )
    }
}
