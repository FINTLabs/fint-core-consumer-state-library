package no.fintlabs.consumer.state.model

data class ConsumerResponse(
    val consumerFields: ConsumerRequest,
    val operation: Operation
) {
    companion object {
        fun fromConsumerRequest(consumerRequest: ConsumerRequest, operation: Operation) = ConsumerResponse(
            consumerRequest,
            operation
        )
    }
}
