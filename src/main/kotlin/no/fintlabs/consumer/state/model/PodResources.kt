package no.fintlabs.consumer.state.model

data class PodResources(
    val limits: Limits = Limits(),
    val requests: Requests = Requests()
)

data class Limits(
    val memory: String = "1024Mi",
    val cpu: String = "500m"
)

data class Requests(
    val memory: String = "128Mi",
    val cpu: String = "100m"
)
