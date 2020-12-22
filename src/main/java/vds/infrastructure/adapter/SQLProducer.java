package vds.infrastructure.adapter;

public class SQLProducer implements ProducerStrategyInterface {
    @Override
    public void saveEvent(Object obj) {
        System.out.println("Save SQL");
    }
}
