package vds.infrastructure.events;

import vds.infrastructure.adapter.ProducerFactory;
import vds.infrastructure.adapter.ProducerStrategyInterface;
import vds.infrastructure.config.ConfigStorage;

public class Data {

    public ProducerStrategyInterface producerStrategy;
    public ConfigStorage configStorage;

    public String name;
    public String age;

    public Data(){

    }

    public void setProducerStrategy(ProducerStrategyInterface producerStrategy) {
        this.producerStrategy = producerStrategy;
    }

    public void setConfigStorage(ConfigStorage configStorage) {
        this.configStorage = configStorage;
    }

    public void saveData(){
        this.producerStrategy.saveEvent(this);
    }

    public void showPartnerConfig(){
        this.configStorage.getConfig();
    };
}
