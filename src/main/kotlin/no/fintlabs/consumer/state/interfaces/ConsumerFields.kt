package no.fintlabs.consumer.state.interfaces

interface ConsumerFields {
    val shared: Boolean?
    val version: String?
    val limitsCpu: String?
    val limitsMemory: String?
    val requestsCpu: String?
    val requestsMemory: String?
    val resources: List<String>?
    val writeableResources: List<String>?
    val cacheDisabledResources: List<String>?
}
