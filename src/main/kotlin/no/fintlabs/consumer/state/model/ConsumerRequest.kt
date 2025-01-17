package no.fintlabs.consumer.state.model

data class ConsumerRequest(
    val consumer: Consumer,
    val operation: Operation
)
