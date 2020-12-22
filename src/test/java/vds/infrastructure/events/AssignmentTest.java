package vds.infrastructure.events;

import vds.infrastructure.adapter.ProducerFactory;
import vds.infrastructure.model.Partner;

public class AssignmentTest {
    public static void main(String[] args){
        ProducerFactory producerFactory = new ProducerFactory();

        Data data = new Data();
        data.setProducerStrategy(producerFactory.createSQLProducer());
        data.saveData();
        System.out.println("---");
        data.setProducerStrategy(producerFactory.createPubsubProducer("TEST"));
        data.saveData();
        System.out.println("---");
        data.setConfigStorage(producerFactory.getPartnerConfig(Partner.PartnerKey.TIKI));
        data.showPartnerConfig();
        System.out.println("---");
        data.setConfigStorage(producerFactory.getPartnerConfig(Partner.PartnerKey.SHOPEE));
        data.showPartnerConfig();
        System.out.println("---");
        data.setConfigStorage(producerFactory.getPartnerConfig(Partner.PartnerKey.LAZADA));
        data.showPartnerConfig();

    }
}
