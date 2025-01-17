package no.fintlabs.consumer.state.model

data class Consumer(
    val id: String = "",
    val domain: String,
    val `package`: String,
    val org: String,
    val version: String,
    val managed: Boolean = true,
    val resources: List<String> = mutableListOf(),
    val podResources: PodResources = PodResources(),
    val writeableResources: List<String> = mutableListOf(),
    val cacheDisabledResources: List<String> = mutableListOf()
)
