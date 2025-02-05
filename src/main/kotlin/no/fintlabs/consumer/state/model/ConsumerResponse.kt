package no.fintlabs.consumer.state.model

data class ConsumerResponse(
    val consumer: ConsumerRequest,
    val operation: Operation
)
