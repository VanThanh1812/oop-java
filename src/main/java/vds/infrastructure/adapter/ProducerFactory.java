package vds.infrastructure.adapter;

import vds.infrastructure.config.ConfigStorage;
import vds.infrastructure.config.LazadaConfigStorage;
import vds.infrastructure.config.ShopeeConfigStorage;
import vds.infrastructure.config.TikiConfigStorage;
import vds.infrastructure.model.Partner.PartnerKey;

public class ProducerFactory implements ProducerFactoryInterface, PartnerConfigFactory {
    @Override
    public ProducerStrategyInterface createSQLProducer() {
        return new SQLProducer();
    }

    @Override
    public ProducerStrategyInterface createPubsubProducer(String topic) {
        return new KafkaProducer();
    }

    @Override
    public ConfigStorage getPartnerConfig(PartnerKey key) {
        switch (key) {

            case TIKI:
                return new TikiConfigStorage();

            case LAZADA:
                return new LazadaConfigStorage();

            case SHOPEE:
                return new ShopeeConfigStorage();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
