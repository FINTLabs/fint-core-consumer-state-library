package no.fintlabs.consumer.state.interfaces

import no.fintlabs.consumer.state.model.PodResources

interface Consumer: ConsumerIdentificator, ConsumerFields {
    override val domain: String
    override val `package`: String
    override val org: String
    override val shared: Boolean
    override val version: String
    override val resources: List<String>
    override val podResources: PodResources
    override val writeableResources: List<String>
    override val cacheDisabledResources: List<String>
}