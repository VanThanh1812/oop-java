package vds.infrastructure.adapter;

public class KafkaProducer implements ProducerStrategyInterface {
    @Override
    public void saveEvent(Object obj) {
        System.out.println("Save kafka");
    }
}
