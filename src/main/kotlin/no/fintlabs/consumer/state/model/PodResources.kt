package no.fintlabs.consumer.state.model

import jakarta.persistence.Embeddable

@Embeddable
data class PodResources(
    val limits: Limits = Limits(),
    val requests: Requests = Requests()
)

@Embeddable
data class Limits(
    val memory: String = "1024Mi",
    val cpu: String = "500m"
)

@Embeddable
data class Requests(
    val memory: String = "128Mi",
    val cpu: String = "100m"
)
