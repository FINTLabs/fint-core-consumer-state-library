package no.fintlabs.consumer.state.interfaces

interface Consumer : ConsumerIdentificator, ConsumerFields {
    override val domain: String
    override val `package`: String
    override val org: String
    override val shared: Boolean
    override val version: String
    override val limitsCpu: String
    override val limitsMemory: String
    override val requestsCpu: String
    override val requestsMemory: String
    override val resources: List<String>
    override val writeableResources: List<String>
    override val cacheDisabledResources: List<String>
}