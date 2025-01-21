package no.fintlabs.consumer.state.interfaces

import no.fintlabs.consumer.state.model.PodResources

interface ConsumerFields {
    val version: String?
    val managed: Boolean?
    val resources: List<String>?
    val podResources: PodResources?
    val writeableResources: List<String>?
    val cacheDisabledResources: List<String>?
}
